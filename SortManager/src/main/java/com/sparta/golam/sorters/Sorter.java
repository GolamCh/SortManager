package com.sparta.golam.sorters;

import com.sparta.golam.exceptions.EmptyArrayException;

public interface Sorter {

    int[] sortArray(int[] arrayToSort) throws EmptyArrayException;

}
