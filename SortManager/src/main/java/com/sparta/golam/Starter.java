package com.sparta.golam;

import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.sorters.BubbleSort;
import com.sparta.golam.sorters.MergeSort;
import com.sparta.golam.utilities.ArrayGenerator;
import com.sparta.golam.utilities.Printer;
import com.sparta.golam.utilities.Timer;

public class Starter {

    /*public static int[] iCBA(int[] array) {
        MergeSort mergeSort = new MergeSort();
        try {
            int[] a = mergeSort.sortArray(array);
        } catch (EmptyArrayException e) {
            App.logger.error(e.getMessage(), e);
        }
        return a;

    }*/

    public static void starter() {
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();

        int[] randomArray = ArrayGenerator.randomArray(100);
        int[] orderedArray = ArrayGenerator.orderedArray(5);
        int[] testArray = {1,4,5,3,2,5,6,3,2,45};

        //Printer.printArray(iCBA(randomArray));

        Timer.compareTimes(randomArray);

        Printer.print(Timer.timeMergeSort(randomArray));

        Printer.printArray(bubbleSort.sortArray(randomArray));
        Printer.printArray(mergeSort.sortArray(randomArray));

        Printer.printArray(bubbleSort.sortArray(orderedArray));
        Printer.printArray(mergeSort.sortArray(orderedArray));

        Printer.printArray(bubbleSort.sortArray(testArray));
        Printer.printArray(mergeSort.sortArray(testArray));


    }
}
