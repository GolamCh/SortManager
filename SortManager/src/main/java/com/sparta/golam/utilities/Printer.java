package com.sparta.golam.utilities;

import java.util.Arrays;

public class Printer {

    public static void print(Object toPrint) {
        System.out.println(toPrint);
    }

    public static void error(Object toPrint) {
        System.err.println(toPrint);
    }

    public static void line() {
        System.out.println();
    }

    public static void printArray(int[] arrayToPrint) {
        System.out.println(Arrays.toString(arrayToPrint));
    }

    public static void printSameLine(Object toPrint) {
        System.out.print(toPrint);
    }
}
