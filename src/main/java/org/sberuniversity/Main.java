package org.sberuniversity;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Factorial factorial = new Factorial();
        StorageNumber storageNumber = new StorageNumber(factorial);
        storageNumber.load("numbers.txt");
        FactorialThread factorialThread = new FactorialThread(factorial);
        factorialThread.calculateAllFactorials();
    }
}