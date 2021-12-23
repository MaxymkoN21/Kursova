package com.example.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class anketaLoadController {
    public static Integer LOAD;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField AnketaSum;

    @FXML
    private AnchorPane SingUpName;

    @FXML
    private Button buttonBack;

    @FXML
    private Button buttonReturnMoney;

    @FXML
    void initialize() {
       buttonBack.setOnAction(event -> {
           openNew("infoDeposit.fxml",event);
       });
        buttonReturnMoney.setOnAction(event -> {
            anketaLoadController.LOAD = Integer.valueOf(AnketaSum.getText());
            openNew("Load.fxml",event);
        });
        AnketaSum.setOnAction(event -> {

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

