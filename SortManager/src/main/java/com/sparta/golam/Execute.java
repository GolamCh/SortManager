package com.sparta.golam;

import com.sparta.golam.sorters.BubbleSort;
import com.sparta.golam.sorters.MergeSort;
import com.sparta.golam.utilities.ArrayGenerator;
import com.sparta.golam.utilities.Printer;
import com.sparta.golam.utilities.Timer;

public class Execute {

    public static void demoBubbleRandomArray(int lengthOfArray){
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = ArrayGenerator.randomArray(lengthOfArray);
        Printer.print("-------------------- Bubble Sort --------------------");
        Printer.print("This is the starting array: ");
        Printer.printArray(arrayToSort);
        Printer.line();
        int[] sortedArray = bubbleSort.sortArray(arrayToSort);
        Printer.print("The sorted array: ");
        Printer.line();
        Printer.printArray(sortedArray);
        Printer.line();
        Timer.timeBubbleSort(arrayToSort);
        Printer.print("-----------------------------------------------------");
        Printer.print("-----------------------------------------------------");
    }

    public static void demoMergeRandomArray(int lengthOfArray) {
        MergeSort mergeSort = new MergeSort();
        int[] arrayToSort = ArrayGenerator.randomArray(lengthOfArray);
        Printer.print("-------------------- Merge Sort --------------------");
        Printer.print("This is the starting array: ");
        Printer.printArray(arrayToSort);
        Printer.line();
        int[] sortedArray = mergeSort.sortArray(arrayToSort);
        Printer.print("The sorted array: ");
        Printer.printArray(sortedArray);
        Printer.line();
        Timer.timeMergeSort(arrayToSort);
        Printer.print("-----------------------------------------------------");
        Printer.print("-----------------------------------------------------");
    }

    public static void compareSorts(int lengthOfArray) {
        MergeSort mergeSort = new MergeSort();
        int[] arrayToSort = ArrayGenerator.randomArray(lengthOfArray);
        Printer.print("-------------------- Bubble Sort & Merge Sort --------------------");
        Printer.print("This is the starting array: ");
        Printer.printArray(arrayToSort);
        Printer.line();
        int[] sortedArray = mergeSort.sortArray(arrayToSort);
        Printer.print("The sorted array: ");
        Printer.printArray(sortedArray);
        Printer.line();
        Timer.compareTimes(arrayToSort);
        Printer.print("-----------------------------------------------------");
        Printer.print("-----------------------------------------------------");
    }
}
