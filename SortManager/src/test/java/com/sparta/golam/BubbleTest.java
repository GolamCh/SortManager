package com.sparta.golam;

import com.sparta.golam.sorters.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    @DisplayName("Testing if the bubble sort sorts an array")
    public void shouldReturnEvenOrderedArray() {
        Assertions.assertArrayEquals(new int[] {0,1,2,3,4,5}, bubbleSort.sortArray(new int[] {2,1,0,4,5,3}));
    }

    @Test
    @DisplayName("Testing if the bubble sort sort an array of odd length")
    public void shouldReturnOddOrderedArray() {
        Assertions.assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8}, bubbleSort.sortArray(new int[] {2,3,4,5,6,8,7,0,1}));
    }

}
