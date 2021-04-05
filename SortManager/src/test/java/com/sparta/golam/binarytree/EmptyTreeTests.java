package com.sparta.golam.binarytree;

import com.sparta.golam.exceptions.EmptyTreeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmptyTreeTests {
    BinarySearchTree emptyTree = new BinarySearchTree();

    @Test
    public void shouldThrowEmptyTreeException() {
        Exception e = assertThrows(EmptyTreeException.class, () -> emptyTree.getRootElement());
        assertEquals("This tree is empty", e.getMessage());
    }

    @Test
    public void shouldReturnZeroForEmptyTree() {
        Assertions.assertEquals(0, emptyTree.getNumberOfElements());
    }

    @Test
    public void shouldReturnFalseForEmptyTree() {
        Assertions.assertFalse(emptyTree.findElement(6));
    }

}
