package com.example.app;

import com.example.app.Database.DatabaseHndler;
import com.example.app.Database.User;
import com.example.app.animations.Shake;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Controller {

    @FXML
    private Button SignUpButton;

    @FXML
    private Button autsSingin;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize(){

        autsSingin.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String loginpassword =password_field.getText().trim();

            if(!loginText.equals("")&&!loginpassword.equals("")){
                lodinUser(loginText,loginpassword,event);
            }
            else
                System.out.println("EROR");
        });

        SignUpButton.setOnAction(event ->{
            openNew("singUp.fxml",event);

        } );
    }

    private void lodinUser(String loginText, String loginpassword,ActionEvent event) {
        DatabaseHndler dbhandler = new DatabaseHndler() ;
        User user = new User();
        user.setUsername(loginText);
        user.setPassword(loginpassword);
        ResultSet result = dbhandler.getUser(user);

        int count =0 ;
        while (true){
            try {
                if (!result.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            count++;
        }
        if (count>= 1 ){
            openNew("app.fxml",event);
        }
        else {
            Shake userLoginAnim = new Shake(login_field);
            Shake userPassAnim = new Shake(password_field);
            userLoginAnim.playAnim();
            userPassAnim.playAnim();

        }

    }

    public void openNew(String winow , ActionEvent event){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(winow));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root =loader.getRoot();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}

