package com.thread;

import java.util.concurrent.Callable;

public class CallablePrac implements Callable<Boolean> {
    private String raw;

    public CallablePrac(String raw) {
        this.raw = raw;
    }

    @Override
    public Boolean call() throws Exception {
        System.out.println(Thread.currentThread().getName());

        return StringValidator.isValid(raw);
    }
}
