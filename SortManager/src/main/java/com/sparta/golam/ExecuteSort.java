package com.sparta.golam;

import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.SingleValueException;
import com.sparta.golam.sorters.BubbleSort;
import com.sparta.golam.sorters.MergeSort;
import com.sparta.golam.utilities.ArrayGenerator;
import com.sparta.golam.utilities.Printer;
import com.sparta.golam.utilities.Time;

public class ExecuteSort {

    public static void bubbleSort(int arrayLength) throws SingleValueException, EmptyArrayException {
        BubbleSort bubble = new BubbleSort();
        int[] arrayToSort = ArrayGenerator.randomArray(arrayLength);
        Printer.printArray(arrayToSort);
        int[] sortedArray = bubble.sortArray(arrayToSort);
        Printer.printArray(sortedArray);
        Printer.printSameLine("Bubble Sort Total Time: ");
        Printer.print(Time.timeBubble(arrayToSort) + "ns");
        Printer.line();
    }

    public static void mergeSort(int arrayLength) throws EmptyArrayException {
        MergeSort merge = new MergeSort();
        int[] arrayToSort = ArrayGenerator.randomArray(arrayLength);
        Printer.printArray(arrayToSort);
        int[] sortedArray = merge.sortArray(arrayToSort);
        Printer.printArray(sortedArray);
        Printer.printSameLine("Merge Sort Total Time: ");
        Printer.print(Time.timeMerge(arrayToSort) + "ns");
        Printer.line();
    }

    public static void compareSort(int arrayLength) throws SingleValueException, EmptyArrayException {
        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();
        int[] arrayToSort = ArrayGenerator.randomArray(arrayLength);
        int[] sortedArray;
        Printer.printSameLine("Unsorted Array: ");
        Printer.printArray(arrayToSort);
        if (arrayLength < 100) {
            sortedArray = bubble.sortArray(arrayToSort);
        } else {
            sortedArray = merge.sortArray(arrayToSort);
        }
        Printer.printSameLine("Sorted Array: ");
        Printer.printArray(sortedArray);
        Time.compareTime(arrayToSort);
        Printer.line();
    }

    public static void bubbleSort(int[] arrayToSort) throws SingleValueException, EmptyArrayException {
        BubbleSort bubble = new BubbleSort();
        Printer.printArray(arrayToSort);
        int[] sortedArray = bubble.sortArray(arrayToSort);
        Printer.printArray(sortedArray);
        Printer.printSameLine("Bubble Sort Total Time: ");
        Printer.print(Time.timeBubble(arrayToSort) + "ns");
        Printer.line();
    }

    public static void mergeSort(int[] arrayToSort) throws EmptyArrayException {
        MergeSort merge = new MergeSort();
        Printer.printArray(arrayToSort);
        int[] sortedArray = merge.sortArray(arrayToSort);
        Printer.printArray(sortedArray);
        Printer.printSameLine("Merge Sort Total Time: ");
        Printer.print(Time.timeMerge(arrayToSort) + "ns");
        Printer.line();
    }

    public static void compareSort(int[] arrayToSort) throws SingleValueException, EmptyArrayException {
        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();
        int[] sortedArray;
        Printer.printSameLine("Unsorted Array: ");
        Printer.printArray(arrayToSort);
        sortedArray = merge.sortArray(arrayToSort);
        Printer.printSameLine("Sorted Array: ");
        Printer.printArray(sortedArray);
        Time.compareTime(arrayToSort);
        Printer.line();
    }
}
