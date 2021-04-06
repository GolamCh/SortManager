package com.sparta.golam.sorters;

import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.SingleValueException;
import com.sparta.golam.utilities.ArrayGenerator;
import com.sparta.golam.utilities.Printer;
import com.sparta.golam.utilities.Time;
import org.junit.jupiter.api.Test;

public class PerformanceTest {
    int[] smallArray = ArrayGenerator.randomArray(95);
    int[] mediumArray = ArrayGenerator.randomArray(1000);
    int[] largeArray = ArrayGenerator.randomArray(10000);


    //TODO: Complete building performance test
    @Test
    public void compareSortingSmallArrays() throws SingleValueException, EmptyArrayException {
        Printer.print("Timing comparisons of the small array");
        Time.compareTime(smallArray);
        Printer.line();
    }

    @Test
    public void compareSortingMediumArrays() throws SingleValueException, EmptyArrayException {
        Printer.print("Timing comparisons of the medium array");
        Time.compareTime(mediumArray);
        Printer.line();
    }

    @Test
    public void compareSortingLargeArrays() throws SingleValueException, EmptyArrayException {
        Printer.print("Timing comparisons of the large array");
        Time.compareTime(largeArray);
        Printer.line();
    }

}
