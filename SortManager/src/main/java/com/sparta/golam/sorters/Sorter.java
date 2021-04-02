package com.sparta.golam.sorters;

import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.SingleValueException;

public interface Sorter {

    int[] sortArray(int[] arrayToSort) throws EmptyArrayException, SingleValueException;

}
