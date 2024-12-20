package org.sberuniversity;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FactorialThread {
    private final Factorial factorial;

    public FactorialThread(Factorial factorial) {
        this.factorial = factorial;
    }

    public void calculateAllFactorials() {
        List<Integer> numbers = factorial.getNumbers();

        // Создаем фиксированный пул потоков
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (Integer number : numbers) {
            executor.submit(() -> {
                System.out.println("Число: " + number + ", Факториал: " + calculateFactorial(number));
            });
        }
        executor.shutdown();
    }

    private BigInteger calculateFactorial(int number) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
