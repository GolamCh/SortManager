package com.sparta.golam.utilities;

import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.SingleValueException;
import com.sparta.golam.sorters.BubbleSort;
import com.sparta.golam.sorters.MergeSort;

public class Time {

    static long startTime, endTime, finalTime;


    private static void timeStart(){
        startTime = System.nanoTime();
    }

    private static void timeEnd() {
        endTime = System.nanoTime();
    }

    private static void timeFinal() {
        finalTime = endTime - startTime;
    }

    public static long timeMerge(int[] array) throws EmptyArrayException {
        MergeSort ms = new MergeSort();
        long totalTime;
        timeStart();
        ms.sortArray(array);
        timeEnd();
        timeFinal();
        totalTime = finalTime;
        return totalTime;
    }

    public static long timeBubble(int[] array) throws SingleValueException, EmptyArrayException {
        BubbleSort bs = new BubbleSort();
        long totalTime;
        timeStart();
        bs.sortArray(array);
        timeEnd();
        timeFinal();
        totalTime = finalTime;
        return totalTime;
    }

    public static void compareTime(int[] array) throws EmptyArrayException, SingleValueException {
        long timeForMerge = timeMerge(array);
        long timeForBubble = timeBubble(array);
        long timeDifference = timeForMerge - timeForBubble;
        Printer.print("Bubble Sort Time: " + timeForBubble + "ns");
        Printer.print("Merge Sort Time: " + timeForMerge + "ns");
        if (timeForMerge > timeForBubble) {
            Printer.print("Time for bubble sort was quicker by: " + timeDifference + "ns");
        } else {
            Printer.print("Time for merge sort was quicker by: " + (-timeDifference) + "ns");
        }
    }
}
