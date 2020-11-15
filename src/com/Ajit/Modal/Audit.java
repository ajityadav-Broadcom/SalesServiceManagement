package com.Ajit.Modal;

public class Audit {
    private static long uuid = 0;
    private final long id;

    public Audit() {
        this.id = ++uuid;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "id=" + id +
                '}';
    }
}
