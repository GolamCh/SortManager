package com.sparta.golam;

import java.util.Arrays;

public class BubbleSort {
    public static String sorter(int[] unorderedList) {
        int listLength = unorderedList.length;
        int iter = 0; // Iteration counter
        for(int i = 0;i < listLength - 1;i++) {
            for(int j = 0;j < listLength - 1 - i;j++) {
                if (unorderedList[j] > unorderedList[j+1]) {
                    int temp = unorderedList[j+1];
                    unorderedList[j+1] = unorderedList[j];
                    unorderedList[j] = temp;
                } iter++;
            } iter++;
        }
        System.out.println(iter);
        return Arrays.toString(unorderedList);
    }
}





