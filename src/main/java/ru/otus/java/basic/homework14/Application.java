package ru.otus.java.basic.homework14;

import static ru.otus.java.basic.homework14.realization1.ArrayFilling.singleThreadFill;
import static ru.otus.java.basic.homework14.realization2.ArrayFilling.multiThreadFill;

public class Application {
    public static void main(String[] args) {
        singleThreadFill();
        multiThreadFill();
    }
}
