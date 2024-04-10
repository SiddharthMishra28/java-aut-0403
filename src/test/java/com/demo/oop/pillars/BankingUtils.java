package com.demo.oop.pillars;

public class BankingUtils {
    String transactionType;
    String issuingEntity;
    String settlementEntity;
    double transactionAmount;
    String transactionMode;

    public String setTransationType() {
        if(this.transactionType.equalsIgnoreCase("CORPORATE")) {
            return "CORPORATE TRANSACTION INITIATED!";
        }else {
            return "REGULAR TRANSACTION!";
        }
    }

    public String setTransactionMode() {
        if(this.transactionMode.equalsIgnoreCase("UPI")) {
            return "THANKS FOR USING UPI YOUR TRANSACTION IS IN PROGRESS";
        }else {
            return "THANKS FOR TRANSACTION";
        }
    }

    public String transact(String issuingEntity, String settlementEntity, double amount) {
        return "Transaction Initiatied from "+issuingEntity+ " to "+settlementEntity+" with amount : "+amount;
    }
}
