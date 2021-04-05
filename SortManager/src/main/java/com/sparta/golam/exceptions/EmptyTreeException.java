package com.sparta.golam.exceptions;

public class EmptyTreeException extends Exception{

    public EmptyTreeException() {
        super("This tree is empty");
    }
    public EmptyTreeException(String message) {
        super(message);
    }
}
