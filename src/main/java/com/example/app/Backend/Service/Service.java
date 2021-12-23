package com.example.app.Backend.Service;


import com.example.app.*;
import com.example.app.Backend.Banks.BankInfo;
import com.example.app.Backend.Banks.Banks;
import com.example.app.Database.*;
import javafx.event.ActionEvent;
import java.sql.ResultSet;


public class Service {


    public static double depositsum(int sum, double term) {
        Banks bank1 = new Banks();
        BankInfo[] bi = bank1.fillBankInfoArray();
        double percent = 0;
        if (appControler.chenge == "1"|| PercentController.chenge == "1"|| NameController.chenge == "1"
                || MinTermController.chenge == "1" || MinSumController.chenge == "1"
                || MaxTermController.chenge == "1" || MaxSumController.chenge == "1") {
            percent = bi[0].getPercents();
        } else if (appControler.chenge == "2"|| PercentController.chenge == "2"|| NameController.chenge == "2"
                || MinTermController.chenge == "2" || MinSumController.chenge == "2"
                || MaxTermController.chenge == "2" || MaxSumController.chenge == "2") {
            percent = bi[1].getPercents();
        } else if (appControler.chenge == "3" || PercentController.chenge == "3"|| NameController.chenge == "3"
                || MinTermController.chenge == "3" || MinSumController.chenge == "3"
                || MaxTermController.chenge == "3" || MaxSumController.chenge == "3") {
            percent = bi[2].getPercents();
        } else if (appControler.chenge == "4" || PercentController.chenge == "4"|| NameController.chenge == "4"
                || MinTermController.chenge == "4" || MinSumController.chenge == "4"
                || MaxTermController.chenge == "4" || MaxSumController.chenge == "4") {
            percent = bi[3].getPercents();
        } else if (appControler.chenge == "5" || PercentController.chenge == "5"|| NameController.chenge == "5"
                || MinTermController.chenge == "5" || MinSumController.chenge == "5"
                || MaxTermController.chenge == "5" || MaxSumController.chenge == "5") {
            percent = bi[4].getPercents();
        } else if (appControler.chenge == "6" || PercentController.chenge == "6"|| NameController.chenge == "6"
                || MinTermController.chenge == "6" || MinSumController.chenge == "6"
                || MaxTermController.chenge == "6" || MaxSumController.chenge == "6") {
            percent = bi[5].getPercents();
        } else if (appControler.chenge == "7" || PercentController.chenge == "7"|| NameController.chenge == "7"
                || MinTermController.chenge == "7" || MinSumController.chenge == "7"
                || MaxTermController.chenge == "7" || MaxSumController.chenge == "7") {
            percent = bi[6].getPercents();
        }

        double depositsume = sum + (percent * sum * term / 12) / 100;
        return depositsume;
    }

    public static double depositsumadding(int sum, double term, int SUM) {
        Banks bank1 = new Banks();
        BankInfo[] bi = bank1.fillBankInfoArray();
        double percent = 0;
        if (appControler.chenge == "1"|| PercentController.chenge == "1"|| NameController.chenge == "1"
                || MinTermController.chenge == "1" || MinSumController.chenge == "1"
                || MaxTermController.chenge == "1" || MaxSumController.chenge == "1") {
            percent = bi[0].getPercents();
        } else if (appControler.chenge == "2"|| PercentController.chenge == "2"|| NameController.chenge == "2"
                || MinTermController.chenge == "2" || MinSumController.chenge == "2"
                || MaxTermController.chenge == "2" || MaxSumController.chenge == "2") {
            percent = bi[1].getPercents();
        } else if (appControler.chenge == "3" || PercentController.chenge == "3"|| NameController.chenge == "3"
                || MinTermController.chenge == "3" || MinSumController.chenge == "3"
                || MaxTermController.chenge == "3" || MaxSumController.chenge == "3") {
            percent = bi[2].getPercents();
        } else if (appControler.chenge == "4" || PercentController.chenge == "4"|| NameController.chenge == "4"
                || MinTermController.chenge == "4" || MinSumController.chenge == "4"
                || MaxTermController.chenge == "4" || MaxSumController.chenge == "4") {
            percent = bi[3].getPercents();
        } else if (appControler.chenge == "5" || PercentController.chenge == "5"|| NameController.chenge == "5"
                || MinTermController.chenge == "5" || MinSumController.chenge == "5"
                || MaxTermController.chenge == "5" || MaxSumController.chenge == "5") {
            percent = bi[4].getPercents();
        } else if (appControler.chenge == "6" || PercentController.chenge == "6"|| NameController.chenge == "6"
                || MinTermController.chenge == "6" || MinSumController.chenge == "6"
                || MaxTermController.chenge == "6" || MaxSumController.chenge == "6") {
            percent = bi[5].getPercents();
        } else if (appControler.chenge == "7" || PercentController.chenge == "7"|| NameController.chenge == "7"
                || MinTermController.chenge == "7" || MinSumController.chenge == "7"
                || MaxTermController.chenge == "7" || MaxSumController.chenge == "7") {
            percent = bi[6].getPercents();
        }


        double depositsumeb = sum + SUM + (percent * (sum + SUM) * term / 12) / 100;
        return depositsumeb;
    }

    public static double depositsumgetack(int sum, double term, int LOad) {
        Banks bank1 = new Banks();
        BankInfo[] bi = bank1.fillBankInfoArray();
        double percent = 0;
        if (appControler.chenge == "1"|| PercentController.chenge == "1"|| NameController.chenge == "1"
                || MinTermController.chenge == "1" || MinSumController.chenge == "1"
                || MaxTermController.chenge == "1" || MaxSumController.chenge == "1") {
            percent = bi[0].getPercents();
        } else if (appControler.chenge == "2"|| PercentController.chenge == "2"|| NameController.chenge == "2"
                || MinTermController.chenge == "2" || MinSumController.chenge == "2"
                || MaxTermController.chenge == "2" || MaxSumController.chenge == "2") {
            percent = bi[1].getPercents();
        } else if (appControler.chenge == "3" || PercentController.chenge == "3"|| NameController.chenge == "3"
                || MinTermController.chenge == "3" || MinSumController.chenge == "3"
                || MaxTermController.chenge == "3" || MaxSumController.chenge == "3") {
            percent = bi[2].getPercents();
        } else if (appControler.chenge == "4" || PercentController.chenge == "4"|| NameController.chenge == "4"
                || MinTermController.chenge == "4" || MinSumController.chenge == "4"
                || MaxTermController.chenge == "4" || MaxSumController.chenge == "4") {
            percent = bi[3].getPercents();
        } else if (appControler.chenge == "5" || PercentController.chenge == "5"|| NameController.chenge == "5"
                || MinTermController.chenge == "5" || MinSumController.chenge == "5"
                || MaxTermController.chenge == "5" || MaxSumController.chenge == "5") {
            percent = bi[4].getPercents();
        } else if (appControler.chenge == "6" || PercentController.chenge == "6"|| NameController.chenge == "6"
                || MinTermController.chenge == "6" || MinSumController.chenge == "6"
                || MaxTermController.chenge == "6" || MaxSumController.chenge == "6") {
            percent = bi[5].getPercents();
        } else if (appControler.chenge == "7" || PercentController.chenge == "7"|| NameController.chenge == "7"
                || MinTermController.chenge == "7" || MinSumController.chenge == "7"
                || MaxTermController.chenge == "7" || MaxSumController.chenge == "7") {
            percent = bi[6].getPercents();
        }

        double depositsumem = sum + (percent * sum * LOad / 12) / 100;
        return depositsumem;
    }
}

