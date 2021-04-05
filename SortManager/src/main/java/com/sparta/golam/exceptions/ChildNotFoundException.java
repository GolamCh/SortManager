package com.sparta.golam.exceptions;

public class ChildNotFoundException extends Exception {
    public ChildNotFoundException() {
        super("This node has no child here!");
    }
    public ChildNotFoundException(String message) {
        super(message);
    }

}
