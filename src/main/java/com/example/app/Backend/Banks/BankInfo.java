package com.example.app.Backend.Banks;

import java.util.Objects;

    public class BankInfo {
        private String imageUrl;
        private String depositID;
        private  String depositName;
        private int depositSumMin;
        private int depositSumMax;
        private int depositTermMin;
        private int depositTermMax;
        private double percents;

        public BankInfo(String imageUrl, String depositID , String depositName, int depositSumMin, int depositSumMax, int depositTermMin, int depositTermMax, double percents) {
            this.imageUrl = imageUrl;
            this.depositID = depositID;
            this.depositName = depositName;
            this.depositSumMin = depositSumMin;
            this.depositSumMax = depositSumMax;
            this.depositTermMin = depositTermMin;
            this.depositTermMax = depositTermMax;
            this.percents = percents;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getDepositID() {
            return depositID;
        }

        public void setDepositID(String depositID) {
            this.depositID = depositID;
        }

        public String getDepositName() {
            return depositName;
        }

        public void setDepositName(String depositName) {
            this.depositName = depositName;
        }

        public int getDepositSumMin() {
            return depositSumMin;
        }

        public void setDepositSumMin(int depositSumMin) {
            this.depositSumMin = depositSumMin;
        }

        public int getDepositSumMax() {
            return depositSumMax;
        }

        public void setDepositSumMax(int depositSumMax) {
            this.depositSumMax = depositSumMax;
        }

        public int getDepositTermMin() {
            return depositTermMin;
        }

        public void setDepositTermMin(int depositTermMin) {
            this.depositTermMin = depositTermMin;
        }

        public int getDepositTermMax() {
            return depositTermMax;
        }

        public void setDepositTermMax(int depositTermMax) {
            this.depositTermMax = depositTermMax;
        }

        public double getPercents() {
            return percents;
        }

        public void setPercents(double percents) {
            this.percents = percents;
        }



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BankInfo bankInfo = (BankInfo) o;
            return depositSumMin == bankInfo.depositSumMin &&
                    depositSumMax == bankInfo.depositSumMax &&
                    depositTermMin == bankInfo.depositTermMin &&
                    Double.compare(bankInfo.percents, percents) == 0 &&

                    Objects.equals(depositName, bankInfo.depositName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(depositID, depositName, depositSumMin, depositSumMax, depositTermMin, depositTermMin, percents);
        }
    }



