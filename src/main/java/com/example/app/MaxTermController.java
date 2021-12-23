package com.example.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MaxTermController {
    public static String chenge ;
    @FXML
    private Button buttonMaxSum;

    @FXML
    private Button buttonMinSum;

    @FXML
    private Button buttonMinTerm;

    @FXML
    private Button buttonName;

    @FXML
    private Button buttonPercent;

    @FXML
    private Button buttonStart;

    @FXML
    private Button imageAlfabank;

    @FXML
    private Button imageIdeabank;

    @FXML
    private Button imageMono;

    @FXML
    private Button imageOTP;

    @FXML
    private Button imagePrivate;

    @FXML
    private Button imagePumb;

    @FXML
    private Button imageRaifazen;


    @FXML
    void initialize(){
        imageMono.setOnAction(event -> {
            MaxTermController.chenge= "1";
            openNew("mono.fxml",event);
        });
        imageAlfabank.setOnAction(event -> {
            MaxTermController.chenge= "2";
            openNew("alfa.fxml",event);
        });
        imageIdeabank.setOnAction(event -> {
            MaxTermController.chenge= "3";
            openNew("idea.fxml",event);
        });
        imageOTP.setOnAction(event -> {
            MaxTermController.chenge= "7";
            openNew("otp.fxml",event);
        });
        imagePrivate.setOnAction(event -> {
            MaxTermController.chenge= "4";
            openNew("private.fxml",event);        });
        imagePumb.setOnAction(event -> {
            MaxTermController.chenge= "5";
            openNew("pumb.fxml",event);        });
        imageRaifazen.setOnAction(event -> {
            MaxTermController.chenge= "6";
            openNew("raif.fxml",event);
        });
        buttonName.setOnAction(event -> {
            openNew("onName.fxml",event);
        });
        buttonPercent.setOnAction(event -> {
            openNew("onPercent.fxml",event);
        });
        buttonStart.setOnAction(event -> {
            openNew("app.fxml",event);
        });
        buttonMinSum.setOnAction(event -> {
            openNew("onMinSum.fxml",event);
        });
        buttonMaxSum.setOnAction(event -> {
            openNew("onMaxSum.fxml",event);
        });
        buttonMinTerm.setOnAction(event -> {
            openNew("onMinTerm.fxml",event);
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

