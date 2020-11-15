package com.Ajit.excpetion;

public class InvalidCommandException extends RuntimeException {
    public InvalidCommandException(String s) {
        super(s);
    }
}
