package com.example.app.Backend.Banks;

public class Banks {
    public void printBankInfo(BankInfo[] bi) {
        for (BankInfo bankInfo : bi) {
            System.out.println(bankInfo);
        }
    }

    public BankInfo[] fillBankInfoArray() {
        return new BankInfo[]{
                new BankInfo("@assets/mono.jpg","1","Mono",5000,90000,2,12,7.9),
                new BankInfo("@assets/Alfabank.png","2","Alfabank",15000,50000,1,18,7.3),
                new BankInfo("@assets/ideabank.png","3","IdeaBank",30000,70000,14,28,9.9),
                new BankInfo("@assets/private.jpg","4","PrivateBank",10000,85000,5,24,8.5),
                new BankInfo("@assets/pumb.png","5","Pumb",50000,150000,6,16,9.3),
                new BankInfo("@assets/Raifaizen.png","6","Raifaizen",25000,125000,10,20,5.3),
                new BankInfo("@assets/ОТП_Банк.jpg","7","OPtBank",1000,100000,20,30,6.5)
        };
    }
}

