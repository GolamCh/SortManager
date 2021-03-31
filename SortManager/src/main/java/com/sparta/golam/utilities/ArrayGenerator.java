package com.sparta.golam.utilities;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayGenerator {

    public static int[] orderedArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public static int[] randomArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        for (int i = 0;i < arrayLength;i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0,201);
            newArray[i] = randomNum;
        }
        return newArray;
    }

}