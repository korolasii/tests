package org.bank;

import org.junit.Test;

import static org.junit.Assert.*;
import org.bank.back.*;
import java.util.Map;
import java.util.Optional;

public class MainTest {

    @Test
    public void main() {
        Balance balances = new Balance();
        String name = "Alex";
        int expected = 2000;
        int result = balances.getBalance(name);
        assertEquals(expected, result);

        Map<String, Integer> resultMap = WorkWithJSON.loadBalanceFromJson();
        assertTrue(!resultMap.isEmpty());
        assertEquals(Optional.ofNullable(expected), Optional.ofNullable(resultMap.get(name)));

        Person person1 = new Person();
        String namePerson1 = "Denis";
        person1.name = namePerson1;
        int expectedPerson1 = 1232;
        int resultPerson1 = person1.balance();
        assertEquals(expectedPerson1, resultPerson1);

        WorkWithJSON updateBalance = new WorkWithJSON();
        name = "Misha";
        int sumTransaction = -2000;
        int expectedTransaction = 400;
        int resultTransaction = updateBalance.updateBalance(name, sumTransaction);
        assertEquals(expectedTransaction, resultTransaction);
    }
}
