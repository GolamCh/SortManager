package com.sparta.golam;

import com.sparta.golam.binarytree.BinarySearchTree;
import com.sparta.golam.exceptions.ChildNotFoundException;
import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.EmptyTreeException;
import com.sparta.golam.exceptions.SingleValueException;
import com.sparta.golam.utilities.Printer;

public class Starter {

    public static void starter() throws SingleValueException, EmptyArrayException, EmptyTreeException, ChildNotFoundException {

        Execute.demoBubbleRandomArray(10);
        Execute.demoMergeRandomArray(10);
        Execute.compareSorts(10);

        //BinarySearchTree.createBinaryTree();
        BinarySearchTree bt = new BinarySearchTree();
        BinarySearchTree tree = new BinarySearchTree();

        bt.addElement(7);
        bt.addElements(new int[] {3,6,4,5,33});
        Printer.print(bt.getRootElement());
        Printer.print(bt.getNumberOfElements());
        Printer.print(bt.findElement(5));
        Printer.print(bt.findElement(97));
        Printer.print(bt.getLeftChild(6));
        Printer.print(bt.getLeftChild(7));
        Printer.print(bt.getRightChild(3));
        Printer.printArray(bt.getSortedTreeAsc());
        Printer.printArray(bt.getSortedTreeDesc());
        Printer.line();

        tree.addElements(new int[] {45,3,2,8,6,56,4,34,22,1,54,7});
        Printer.printArray(tree.getSortedTreeAsc());
        Printer.printArray(tree.getSortedTreeDesc());


    }
}
