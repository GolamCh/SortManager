package com.sparta.golam;

import com.sparta.golam.binarytree.BinarySearchTree;
import com.sparta.golam.exceptions.ChildNotFoundException;
import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.EmptyTreeException;
import com.sparta.golam.exceptions.SingleValueException;
import com.sparta.golam.utilities.Printer;
import java.util.concurrent.ExecutionException;


public class Starter {

    public static void starter() throws SingleValueException, EmptyArrayException, EmptyTreeException, ChildNotFoundException {

        BinarySearchTree bt = new BinarySearchTree();

                                // ----------------- Sorters -----------------
                                // -------------------------------------------

        // Demonstrating the two sorts using a random array of a length chosen by the user
        ExecuteSort.bubbleSort(15);
        ExecuteSort.mergeSort(27);
        ExecuteSort.compareSort(60);
        // Demonstrating the two sorts using an array defined by the user
        ExecuteSort.bubbleSort(new int[] {3,7,34,2,1,5,7,3,23,32,4,6,3,23,455,2,2,4,5});
        ExecuteSort.mergeSort(new int[] {3,7,34,2,1,5,7,3,23,32,4,6,3,23,455,2,2,4,5});
        ExecuteSort.compareSort(new int[] {3,7,34,2,1,5,7,3,23,32,4,6,3,23,455,2,2,4,5});



                                // ----------------- Binary Tree -----------------
                                // -----------------------------------------------

        // Adding Elements to the binary tree
        bt.addElement(7);
        bt.addElements(new int[] {3,4,65,12,45,56,3,12,4,56,2,123,58,2,12,3});
        // Finding the tree root, checking for specified nodes & retrieving node children
        ExecuteBinaryTree.getRoot(bt);
        ExecuteBinaryTree.checkForNode(bt, 56);
        ExecuteBinaryTree.checkForNode(bt, 97);
        ExecuteBinaryTree.getLeftChild(bt,12);
        ExecuteBinaryTree.getRightChild(bt, 56);
        //Sorting the binary tree in ascending and descending order
        ExecuteBinaryTree.treeValuesAscending(bt);
        ExecuteBinaryTree.treeValuesDescending(bt);

    }
}
