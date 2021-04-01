package com.sparta.golam;

import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.sorters.BubbleSort;
import com.sparta.golam.sorters.MergeSort;
import com.sparta.golam.utilities.ArrayGenerator;
import com.sparta.golam.utilities.Printer;
import com.sparta.golam.utilities.Timer;

public class Starter {

    public static void starter() {

        Execute.demoBubbleRandomArray(10);
        Execute.demoMergeRandomArray(10);
        Execute.compareSorts(10);

    }
}
