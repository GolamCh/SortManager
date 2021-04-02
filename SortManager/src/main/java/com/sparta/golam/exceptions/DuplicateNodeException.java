package com.sparta.golam.exceptions;

public class DuplicateNodeException extends Exception{

    public DuplicateNodeException(){
        super("This node value already exists!");
    }
    public DuplicateNodeException(String message){
        super(message);
    }
}
