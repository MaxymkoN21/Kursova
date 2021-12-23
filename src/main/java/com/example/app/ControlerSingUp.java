package com.example.app;

import com.example.app.Database.DatabaseHndler;
import com.example.app.Database.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControlerSingUp {

    @FXML
    private TextField SingUpAge;

    @FXML
    private CheckBox SingUpChech1;

    @FXML
    private CheckBox SingUpChech2;

    @FXML
    private TextField SingUpCountry;

    @FXML
    private TextField SingUpSecondName;

    @FXML
    private Button autsSingin;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField singUpName;

    @FXML
    private Button buttonBack;

    @FXML
    void initialize(){

        autsSingin.setOnAction(event -> {
            singgUpNewUser();
            openNew("app.fxml",event);
        });
        buttonBack.setOnAction(event -> {
            openNew("hello-view.fxml",event);
        });
    }

    private void singgUpNewUser() {
        DatabaseHndler dbHandler = new DatabaseHndler();
        String FirstName =singUpName.getText();
        String lastname =SingUpSecondName.getText();
        String username =login_field.getText();
        String password =password_field.getText();
        String location =SingUpCountry.getText();
        String age =SingUpAge.getText();
        String gender ="";
        if(SingUpChech1.isSelected())
            gender="Чоло";
        else
            gender="Жін";
        User user =new User(FirstName,lastname,username,password,location,age,gender);

        dbHandler.singUpUser(user);
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
