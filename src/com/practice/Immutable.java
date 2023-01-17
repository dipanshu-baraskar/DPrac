package com.practice;

import java.util.Date;

public final class Immutable {
    private final String name;
    private final int id;
    private final Date date;

    public Immutable(String name, int id, Date date) {
        this.name = name;
        this.id = id;
        this.date = new Date(date.getTime());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }
}
