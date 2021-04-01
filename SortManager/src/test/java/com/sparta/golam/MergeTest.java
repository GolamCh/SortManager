package com.sparta.golam;


import com.sparta.golam.sorters.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeTest {
    MergeSort mergeSort = new MergeSort();

    @Test
    @DisplayName("This makes sure the sorter sorts and array")
    public void shouldReturnOrdered() {
        Assertions.assertArrayEquals(new int[] {0,1,2,3,4,5}, mergeSort.sortArray(new int[] {2,1,0,4,5,3}));
    }

    @Test
    @DisplayName("This tests if the merge sorter correctly sorts srrays of odd length")
    public void shouldReturnOrderedArrayOdd() {
        Assertions.assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8}, mergeSort.sortArray(new int[] {0,1,2,3,4,5,6,7,8}));
    }

}
