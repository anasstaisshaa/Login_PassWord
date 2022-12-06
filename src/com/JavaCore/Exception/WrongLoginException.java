package com.JavaCore.Exception;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
