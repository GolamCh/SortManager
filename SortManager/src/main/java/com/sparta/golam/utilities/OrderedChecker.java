package com.sparta.golam.utilities;

public class OrderedChecker {

    public static boolean isOrdered(int[] array) {
        boolean isOrdered = true;
        for(int i = 1;i < array.length - 1;i++){
            if (array[i] >= array[i-1]) {
                continue;
            } else {
                isOrdered = false;
                break;
            }
        }
        return isOrdered;
    }
}
