package com.sparta.golam;

import com.sparta.golam.binarytree.BinarySearchTree;
import com.sparta.golam.exceptions.ChildNotFoundException;
import com.sparta.golam.exceptions.EmptyTreeException;
import com.sparta.golam.utilities.Printer;

public class ExecuteBinaryTree {

    public static void getRoot(BinarySearchTree tree) throws EmptyTreeException {
        int rootValue = tree.getRootElement();
        Printer.print("The root element of this tree is: " + rootValue);
    }

    public static void checkForNode(BinarySearchTree tree, int nodeValue) {
        boolean isInTree = tree.findElement(nodeValue);
        if (isInTree) {
            Printer.print(nodeValue + " IS in this tree.");
        } else {
            Printer.print(nodeValue + " IS NOT in this tree.");
        }
    }

    public static void getLeftChild(BinarySearchTree tree, int Node) throws ChildNotFoundException {
        int leftChild = tree.getLeftChild(Node);
        Printer.print(leftChild + " is the left child of " + Node);
    }

    public static void getRightChild(BinarySearchTree tree, int Node) throws ChildNotFoundException {
        int rightChild = tree.getRightChild(Node);
        Printer.print(rightChild + " is the right child of " + Node);
    }

    public static void treeValuesAscending(BinarySearchTree tree) {
        Printer.printArray(tree.getSortedTreeAsc());
    }

    public static void treeValuesDescending(BinarySearchTree tree) {
        Printer.printArray(tree.getSortedTreeDesc());
    }
}
