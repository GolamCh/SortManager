package com.sparta.golam.exceptions;

public class EmptyArrayException extends Exception{

    public EmptyArrayException() {
        super("The array is empty, enter an array with values.");
    }
    public EmptyArrayException(String message) {
        super(message);
    }

}
