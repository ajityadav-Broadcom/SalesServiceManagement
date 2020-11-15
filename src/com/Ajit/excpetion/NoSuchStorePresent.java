package com.Ajit.excpetion;

public class NoSuchStorePresent extends RuntimeException {
    public NoSuchStorePresent(String s) {
        super(s);
    }
}
