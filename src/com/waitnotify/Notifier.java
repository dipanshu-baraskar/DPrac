package com.waitnotify;

public class Notifier implements Runnable {
    private Message message;

    Notifier(Message message) {
        this.message = message;
    }


    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        synchronized (message) {
            message.setMessage(name + " Notifier work done");
            message.notify();
            // msg.notifyAll();
        }
    }
}
