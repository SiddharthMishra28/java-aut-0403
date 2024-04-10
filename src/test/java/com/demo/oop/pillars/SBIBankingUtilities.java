package com.demo.oop.pillars;

public class SBIBankingUtilities extends BankingUtils{
    boolean isMobileBankingEnabled;

    public String enableMobileBanking() {
        return "Mobile banking enabled!";
    }
    public static void main(String[] args) {
        SBIBankingUtilities sbiBankingUtilities = new SBIBankingUtilities();
        sbiBankingUtilities.transactionMode = "UPI";
        sbiBankingUtilities.transactionType = "CORPORATE";
        System.out.println(sbiBankingUtilities.setTransactionMode());
        System.out.println(sbiBankingUtilities.setTransationType());
        System.out.println(sbiBankingUtilities.transact("INFOSYS", "TCS", 30000));
    }

}
