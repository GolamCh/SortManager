package com.sparta.golam.binarytree;

import com.sparta.golam.exceptions.ChildNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinaryTreeTest {
    BinarySearchTree bt = new BinarySearchTree();

    @Test
    public void addingAndCheckingForRoot() {
        bt.addElement(7);
        Assertions.assertTrue(bt.findElement(7));
    }

    @Test
    public void addingAndCheckingForMultipleAdds() {
        bt.addElements(new int[] {3,6,4,5,33});
        Assertions.assertTrue(bt.findElement(3));
        Assertions.assertTrue(bt.findElement(6));
        Assertions.assertTrue(bt.findElement(4));
        Assertions.assertTrue(bt.findElement(5));
        Assertions.assertTrue(bt.findElement(33));
    }

    /*@Test
    public void rightChildNotFoundTest(){
        Exception e = assertThrows(ChildNotFoundException.class, () -> bt.getRightChild(6));
        assertEquals("This node has no child here!", e.getMessage());
    }

    @Test
    public void leftChildNotFoundTest() {
        Exception e = assertThrows(ChildNotFoundException.class, () -> bt.getLeftChild(4));
        assertEquals("This node has no child here!", e.getMessage());
    }*/

    @Test
    public void getLeftChildTest() throws ChildNotFoundException {
        Assertions.assertEquals(4, bt.getLeftChild(6));
    }

    @Test
    public void getRightChildTest() throws ChildNotFoundException {
        Assertions.assertEquals(6, bt.getRightChild(3));
    }

    @Test
    public void shouldReturnAscendingOrder() {
        Assertions.assertArrayEquals(new int[] {3,4,5,6,7,33}, bt.getSortedTreeAsc());
    }

}
