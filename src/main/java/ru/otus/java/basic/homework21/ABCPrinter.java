package ru.otus.java.basic.homework21;

import java.util.concurrent.*;

public class ABCPrinter {

    private static final Object lock = new Object();
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(new Task("A"));
        executor.submit(new Task("B"));
        executor.submit(new Task("C"));

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }

    static class Task implements Runnable {
        private final String letter;

        public Task(String letter) {
            this.letter = letter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    while (counter % 3 != getLetterIndex(letter)) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(letter);
                    counter++;
                    lock.notifyAll();
                }
            }
        }

        private int getLetterIndex(String letter) {
            switch (letter) {
                case "A":
                    return 0;
                case "B":
                    return 1;
                case "C":
                    return 2;
                default:
                    throw new IllegalArgumentException("Invalid letter: " + letter);
            }
        }
    }
}
