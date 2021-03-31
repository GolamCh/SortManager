package com.sparta.golam.exceptions;

public class SingleValueException extends Exception {

    public SingleValueException() {
        super("The array only has one value, array must be of length 2 or more");
    }
    public SingleValueException(String message) {
        super(message);
    }
}
