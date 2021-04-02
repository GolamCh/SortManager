package com.sparta.golam;

import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.SingleValueException;
import com.sparta.golam.sorters.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BubbleTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    @DisplayName("Testing if the bubble sort sorts an array")
    public void shouldReturnEvenOrderedArray() throws SingleValueException, EmptyArrayException {
        Assertions.assertArrayEquals(new int[] {0,1,2,3,4,5}, bubbleSort.sortArray(new int[] {2,1,0,4,5,3}));
    }

    @Test
    @DisplayName("Testing if the bubble sort sort an array of odd length")
    public void shouldReturnOddOrderedArray() throws SingleValueException, EmptyArrayException {
        Assertions.assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8}, bubbleSort.sortArray(new int[] {2,3,4,5,6,8,7,0,1}));
    }

    @Test
    public void EmptyArrayTest(){
        Exception exception = assertThrows(EmptyArrayException.class, () -> bubbleSort.sortArray(new int[]{}));
        assertEquals("The array is empty, enter an array with values.", exception.getMessage());
    }

    @Test
    public void SingleValueArrayTest() {
        Exception exception = assertThrows(SingleValueException.class, () -> bubbleSort.sortArray(new int[] {5}));
        assertEquals("The array only has one value, array must be of length 2 or more", exception.getMessage());
    }

}
