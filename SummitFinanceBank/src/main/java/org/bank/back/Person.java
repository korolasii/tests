package org.bank.back;

public class Person {
    public String name;

    public int balance(){
        return Balance.getBalance(name);
    }
}
