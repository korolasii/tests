package org.bank.back;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;


public class WorkWithJSON {

    static String path = "src\\main\\java\\org\\bank\\back\\file.json";
    public static Map<String, Integer> loadBalanceFromJson() {
        String filePath = path;
        Map<String, Integer> map = new HashMap<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }
            br.close();


            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(jsonContent.toString()).getAsJsonObject();


            for (Map.Entry<String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue().getAsInt();
                map.put(key, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }

    static Map<String, Integer> addNewPerson(String name) {
        Map<String, Integer> map = loadBalanceFromJson();
        map.put(name, 0);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        String json = gson.toJson(map);


        try (FileWriter writer = new FileWriter(path)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }


    public static int updateBalance(String name, int sumTransaction) {
        Map<String, Integer> map = loadBalanceFromJson();

        if (map.containsKey(name)) {
            int currentBalance = map.get(name);

            if (sumTransaction < 0) {
                int newBalance = currentBalance + sumTransaction;
                if (newBalance < 0) {
                    System.out.println("Transaction cannot be processed. Insufficient funds.");
                    return currentBalance;
                }

                map.put(name, newBalance);
            } else {
                map.put(name, currentBalance + sumTransaction);
            }

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(map);

            try (FileWriter writer = new FileWriter(path)) {
                writer.write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Person not found in the balance records.");
        }

        return map.get(name);
    }



}
