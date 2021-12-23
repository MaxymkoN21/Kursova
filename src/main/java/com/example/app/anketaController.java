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

public class anketaController {
    public static Integer Sum;
    public static Integer Term;

    @FXML
    private Button AnketaFind;

    @FXML
    private TextField AnketaSum;

    @FXML
    private TextField AnketaTerm;

    @FXML
    private Button exit;
    @FXML
    void initialize() {
        AnketaFind.setOnAction(event -> {
            anketaController.Sum= Integer.valueOf(AnketaSum.getText());
            anketaController.Term = Integer.valueOf(AnketaTerm.getText());
            openNew("infoDeposit.fxml",event);
        });
        exit.setOnAction(event -> {
            openNew("app.fxml",event);
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
