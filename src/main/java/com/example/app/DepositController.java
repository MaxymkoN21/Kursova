package com.example.app;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import com.example.app.Backend.Banks.BankInfo;
import com.example.app.Backend.Banks.Banks;
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


public class DepositController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Addingbutton;

    @FXML
    private Button Earlierbutton;

    @FXML
    private Button Exitеbutton;

    @FXML
    private Button onMаіnbutton;

    @FXML
    private Label screen;
    @FXML
    private Label screen1;


    @FXML
    void initialize() {
        onMаіnbutton.setOnAction(event -> {
            openNew("hello-view.fxml", event);
        });

        Exitеbutton.setOnAction(event -> {
            System.exit(0);
        });
        Addingbutton.setOnAction(event -> {
            openNew("anketaAddingMoney.fxml", event);
        });
        Earlierbutton.setOnAction(event -> {
            openNew("anketaLoad.fxml", event);
        });
        Banks bank1 = new Banks();
        BankInfo[] bi = bank1.fillBankInfoArray();
        List<BankInfo> filtered = Arrays.stream(bi).filter(b -> {
            return b.getDepositID().equals(appControler.chenge)
    || b.getDepositID().equals(PercentController.chenge)  || b.getDepositID().equals(NameController.chenge)
            || b.getDepositID().equals(MinTermController.chenge)|| b.getDepositID().equals(MinSumController.chenge)
                    || b.getDepositID().equals(MaxTermController.chenge)|| b.getDepositID().equals(MaxSumController.chenge);

        }).toList();

        BankInfo currentBank = filtered.get(0);
        screen.setText("Ви у банку " + currentBank.getDepositName());
        screen1.setText("Ваш Депозит " + Service.depositsum(anketaController.Sum,anketaController.Term));
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

