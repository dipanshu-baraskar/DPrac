package com.test;

import java.util.Collections;
import java.util.List;

public final class PersonImmutable {
    private final String name;
    private final List<String> degrees;

    public PersonImmutable(String name, List<String> degrees) {
        this.name = name;
        this.degrees = Collections.unmodifiableList(degrees);
    }

    public String getName() {
        return name;
    }

    public List<String> getDegrees() {
        return degrees;
    }

}
