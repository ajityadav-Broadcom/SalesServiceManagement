package com.Ajit.excpetion;

public class UnsupportedItem extends RuntimeException {
    public UnsupportedItem(String s) {
        super(s);
    }
}
