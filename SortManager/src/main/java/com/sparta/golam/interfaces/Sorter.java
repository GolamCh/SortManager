package com.sparta.golam.interfaces;

import com.sparta.golam.exceptions.EmptyArrayException;

public interface Sorter {

    int[] sortArray(int[] arrayToSort) throws EmptyArrayException;

}
