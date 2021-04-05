package com.sparta.golam.binarytree;

import com.sparta.golam.exceptions.ChildNotFoundException;
import com.sparta.golam.exceptions.DuplicateNodeException;
import com.sparta.golam.exceptions.EmptyTreeException;

public interface BinaryTree {
    int getRootElement() throws EmptyTreeException;

    int getNumberOfElements();

    void addElement(int element) throws DuplicateNodeException;

    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
