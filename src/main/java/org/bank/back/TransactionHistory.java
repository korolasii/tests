package org.bank.back;

public class TransactionHistory extends Transaction{
    private String date;
    TransactionHistory(String type, float amount, String sender, String adress, String date) {
        super(type, amount, sender, adress);
        this.date=date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}