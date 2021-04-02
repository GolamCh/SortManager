package com.sparta.golam.binarytree;

import com.sparta.golam.exceptions.DuplicateNodeException;
import com.sparta.golam.logging.App;
import com.sparta.golam.utilities.Printer;

public class BinarySearchTree implements BinaryTree{

    Node root;

    @Override
    public int getRootElement() {
        return 0;
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {
        root = addNew(root, element);
    }

    @Override
    public void addElements(int[] elements) {

    }

    @Override
    public boolean findElement(int value) {
        return false;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static BinarySearchTree createBinaryTree() {
        BinarySearchTree bt = new BinarySearchTree();

        bt.addElement(7);

        return bt;

    }


    private Node addNew(Node current, int value) {
        if (current != null) {
            try {
                if (value == current.value) {
                    throw new DuplicateNodeException();
                }
            } catch (DuplicateNodeException e) {
                Printer.print(e.getMessage());
                App.logger.error(e.getMessage(), e);
            }
        }
        if (current == null) {
            return new Node(value);
        } else if (value < current.value) {
            current.left = addNew(current.left, value);
        } else if (value > current.value) {
            current.right = addNew(current.right, value);
        } /*else {
            return current;
        }*/
        return current;
    }


}
