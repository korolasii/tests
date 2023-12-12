package org.bank.back;


import java.util.HashMap;
import java.util.Map;
public class Balance {
    protected static Map<String, Integer> balance = WorkWithJSON.loadBalanceFromJson();

    public static int getBalance(String name) {
        if (!balance.containsKey(name)) {
            WorkWithJSON.addNewPerson(name);
            balance = WorkWithJSON.loadBalanceFromJson();
        }
        return balance.get(name);
    }

}
