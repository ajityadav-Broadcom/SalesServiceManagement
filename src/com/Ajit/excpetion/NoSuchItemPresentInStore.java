package com.Ajit.excpetion;

public class NoSuchItemPresentInStore extends Throwable {
    public NoSuchItemPresentInStore(String s) {
        super(s);
    }
}
