package com.sparta.golam.utilities;

import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.SingleValueException;
import com.sparta.golam.sorters.BubbleSort;
import com.sparta.golam.sorters.MergeSort;

public class Timer {

    public static long timeBubbleSort(int[] array) throws SingleValueException, EmptyArrayException {
        BubbleSort bubbleSort = new BubbleSort();
        final long startTime = System.nanoTime();
        bubbleSort.sortArray(array);
        final long endTime = System.nanoTime();
        final long totalTime = (endTime - startTime);
        Printer.print("Bubble Sort completion time: " + totalTime + "×10^-9 s");
        return totalTime;
    }

    public static long timeMergeSort(int[] array) throws EmptyArrayException {
        MergeSort mergeSort = new MergeSort();
        final long startTime = System.nanoTime();
        mergeSort.sortArray(array);
        final long endTime = System.nanoTime();
        long totalTime = (endTime - startTime);
        Printer.print("Merge Sort completion time: " + totalTime + "×10^-9 s");
        return totalTime;
    }

    public static void compareTimes(int[] array) throws SingleValueException, EmptyArrayException {
        final long bubbleTime = timeBubbleSort(array);
        final long mergeTime = timeMergeSort(array);
        long difference;
        if (bubbleTime > mergeTime) {
            difference = bubbleTime - mergeTime;
            Printer.print("MERGE SORT was quicker by: " + difference + "×10^-9 s");
        } else if (mergeTime > bubbleTime) {
            difference = mergeTime - bubbleTime;
            Printer.print("BUBBLE SORT was quicker by: " + difference + "×10^-9 s");
        }
    }
}
