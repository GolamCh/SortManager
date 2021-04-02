package com.sparta.golam;


import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.sorters.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MergeTest {
    MergeSort mergeSort = new MergeSort();

    @Test
    @DisplayName("This makes sure the sorter sorts and array")
    public void shouldReturnOrdered() throws EmptyArrayException {
        Assertions.assertArrayEquals(new int[] {0,1,2,3,4,5}, mergeSort.sortArray(new int[] {2,1,0,4,5,3}));
    }

    @Test
    @DisplayName("This tests if the merge sorter correctly sorts arrays of odd length")
    public void shouldReturnOrderedArrayOdd() throws EmptyArrayException {
        Assertions.assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8}, mergeSort.sortArray(new int[] {0,1,2,3,4,5,6,7,8}));
    }

    @Test
    public void EmptyArrayTest(){
        Exception exception = assertThrows(EmptyArrayException.class, () -> mergeSort.sortArray(new int[]{}));
        assertEquals("Empty Array", exception.getMessage());
    }


}
