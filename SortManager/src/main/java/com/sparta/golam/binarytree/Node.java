package com.sparta.golam.binarytree;

import com.sparta.golam.exceptions.DuplicateNodeException;
import com.sparta.golam.utilities.Printer;

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    /*private Node addNew(Node current, int value) {
        try {
            if (value == current.value) {
                throw new DuplicateNodeException();
            }
        } catch (DuplicateNodeException e) {
            Printer.print(e.getMessage());
        }
        if (current == null) {
            return new Node(value);
        } else if (value < current.value) {
            current.left = addNew(current.left, value);
        } else if (value > current.value) {
            current.right = addNew(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addNew(root, value);

    }*/
}
