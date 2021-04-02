package com.sparta.golam.utilities;

import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.SingleValueException;
import com.sparta.golam.sorters.BubbleSort;
import com.sparta.golam.sorters.MergeSort;

public class Timer {

    public static long timeBubbleSort(int[] array) throws SingleValueException, EmptyArrayException {
        BubbleSort bubbleSort = new BubbleSort();
        long startTime = System.nanoTime();
        bubbleSort.sortArray(array);
        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime);
        Printer.print("Bubble Sort completion time: " + totalTime + "×10^-9 s");
        return totalTime;
    }

    public static long timeMergeSort(int[] array) throws EmptyArrayException {
        MergeSort mergeSort = new MergeSort();
        long startTime = System.nanoTime();
        mergeSort.sortArray(array);
        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime);
        Printer.print("Merge Sort completion time: " + totalTime + "×10^-9 s");
        return totalTime;
    }

    public static void compareTimes(int[] array) throws SingleValueException, EmptyArrayException {
        long bubbleTime = timeBubbleSort(array);
        long mergeTime = timeMergeSort(array);
        long difference;
        //Printer.print("The bubble sorter completed the sort in: "+bubbleTime+"×10^-9 s");
        //Printer.print("The merge sorter completed the sort in: "+mergeTime+"×10^-9 s");
        if (bubbleTime > mergeTime) {
            difference = bubbleTime - mergeTime;
            Printer.print("Merge Sort was quicker by: " + difference + "×10^-9 s");
        } else if (mergeTime > bubbleTime) {
            difference = mergeTime - bubbleTime;
            Printer.print("Bubble Sort was quicker by: " + difference + "10^-9 s");
        }
    }
}
