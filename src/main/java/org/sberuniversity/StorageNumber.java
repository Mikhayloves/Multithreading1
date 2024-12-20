package org.sberuniversity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StorageNumber {
    private final Factorial factorial; // Используем общий объект

    public StorageNumber(Factorial factorial) {
        this.factorial = factorial;
    }

    public void load(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    factorial.save(number); // Сохраняем числа в *общий* объект
                } catch (NumberFormatException e) {
                }
            }
        }
    }
}