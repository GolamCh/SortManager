package com.sparta.golam.binarytree;

import com.sparta.golam.exceptions.ChildNotFoundException;
import com.sparta.golam.exceptions.EmptyTreeException;
import com.sparta.golam.logging.App;
import java.util.ArrayList;

public class BinarySearchTree implements BinaryTree{

    static Node root = null;

    @Override
    public int getRootElement() throws EmptyTreeException{
        int rootElement;
        if(root != null) {
            rootElement = root.value;
        } else {
            App.logger.error("EmptyTreeException: This tree has no nodes");
            throw new EmptyTreeException();
        }
        return rootElement;
    }

    //TODO: Refactor This
    @Override
    public int getNumberOfElements() {
        if (root != null) {
            return root.getSize();
        } else {
            return 0;
        }
    }

    @Override
    public void addElement(int element){
        root = addNew(root, element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            root = addNew(root, element);
        }
    }

    @Override
    public boolean findElement(int value) {
        if (root == null) {
            return false;
        } else {
            return root.find(value);
        }
    }

    // TODO: Log Exceptions
    // TODO: Create Tests

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return root.getLeft(element);
    }

    // TODO: Log Exceptions
    // TODO: Create Tests

    @Override
    public int getRightChild(int element) throws ChildNotFoundException{
        return root.getRight(element);
    }

    @Override
    public int[] getSortedTreeAsc() {
        if (root != null) {
            root.inOrder();
        }
        int treeSize = TreeSort.treeSort.size();
        int[] sortedTreeAsc = new int[treeSize];
        for (int i = 0;i < treeSize;i++) {
            sortedTreeAsc[i] = TreeSort.treeSort.get(i);
        }
        TreeSort.treeSort = new ArrayList<>();
        return sortedTreeAsc;
    }

    @Override
    public int[] getSortedTreeDesc() {
        if (root != null) {
            root.inOrder();
        }
        int treeSize = TreeSort.treeSort.size();
        int[] sortedTreeAsc = new int[treeSize];
        for (int i = 0;i < treeSize;i++) {
            sortedTreeAsc[i] = TreeSort.treeSort.get(treeSize - 1 - i);
        }
        TreeSort.treeSort = new ArrayList<>();
        return sortedTreeAsc;
    }

    private Node addNew(Node current, int value) {
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

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }

        //TODO: Refactor This
        private int getSize() {
            int leftSize = 0;
            int rightSize = 0;
            if (this.left != null) {
                leftSize = this.left.getSize();
            }
            if (this.right != null) {
                rightSize = this.right.getSize();
            }
            return 1 + leftSize + rightSize;
        }

        //TODO: Refactor This
        private boolean find(int value){
            boolean found = false;
            if (value == this.value) {
                return true;
            } else if (value < this.value && this.left != null) {
                found = this.left.find(value);
            } else if (value > this.value && this.right != null) {
                found =  this.right.find(value);
            }
            return found;
        }

        private int getLeft(int item) throws ChildNotFoundException {
            int target = 0;
            if (this.value == item && this.left != null) {
                target = this.left.value;
            } else if (item < this.value && this.left != null) {
                target = this.left.getLeft(item);
            } else if (item > this.value && this.right != null) {
                target =  this.right.getLeft(item);
            } else if (this.right == null) {
                App.logger.error("ChildNotFoundException: Node has no left child");
                throw new ChildNotFoundException();
            }
            return target;
        }

        private int getRight(int item) throws ChildNotFoundException{
            int target = 0;
            if (this.value == item && this.right != null) {
                target = this.right.value;
            } else if (item < this.value && this.left != null) {
                target = this.left.getRight(item);
            } else if (item > this.value && this.right != null) {
                target =  this.right.getRight(item);
            } else if (this.right == null) {
                App.logger.error("ChildNotFoundException: Node has no right child");
                throw new ChildNotFoundException();
            }
            return target;
        }

        private void inOrder() {
            if (this.left != null) {
                this.left.inOrder();
            }
            //treeSort.add(this.value);
            TreeSort.treeSort.add(this.value);
            if (this.right != null) {
                this.right.inOrder();
            }
        }

    }



}
