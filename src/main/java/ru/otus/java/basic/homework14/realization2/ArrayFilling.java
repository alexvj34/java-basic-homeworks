package ru.otus.java.basic.homework14.realization2;


public class ArrayFilling {

    public static void multiThreadFill() {
        int size = 100_000_000;
        double[] array = new double[size];
        int numberOfThreads = 4;
        Thread[] threads = new Thread[numberOfThreads];
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfThreads; i++) {
            final int start = i * (size / numberOfThreads);
            final int end = (i + 1) * (size / numberOfThreads);

            threads[i] = new Thread(() -> {
                for (int j = start; j < end; j++) {
                    array[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения в многопоточном режиме: " + (endTime - startTime) + " мс");
    }
}
