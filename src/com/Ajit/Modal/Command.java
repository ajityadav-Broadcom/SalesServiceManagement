package com.Ajit.Modal;

import com.Ajit.excpetion.InvalidCommandException;

public class Command {
    private String key;
    private String value;

    public Command(String input) {
        String args[] = input.split("=");
        if (args.length > 2) throw new InvalidCommandException(input + " command is not valid");
        this.key = args[0];
        if (args.length > 1) {
            this.value = args[1];
        } else {
            this.value = "";
        }
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
