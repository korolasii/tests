package org.bank.back;

public class Transaction {
    private String type;
    private float amount;
    private String sender;
    private String adress;

    Transaction(String type, float amount, String sender, String adress){
        this.type=type;
        this.amount=amount;
        this.sender=sender;
        this.adress=adress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
