package com.example.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.app.Backend.Service.Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LoadController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Exitеbutton;

    @FXML
    private Button onMаіnbutton;

    @FXML
    private Label label1;


    @FXML
    void initialize() {
        label1.setText("Ви отримаєте " + Service.depositsumgetack(anketaController.Sum,anketaController.Term,anketaLoadController.LOAD));
        Exitеbutton.setOnAction(event -> {
            System.exit(0);
        });
        onMаіnbutton.setOnAction(event -> {
            openNew("hello-view.fxml", event);
        });
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
