package com.waitnotify;

public class Waiter implements Runnable {
    private Message message;

    Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (message) {
            try {
                System.out.println(name + " waiting to get notified at time:" + System.currentTimeMillis());
                message.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " waiter thread got notified at time:" + System.currentTimeMillis());
            //process the message now
            System.out.println(name + " processed: " + message.getMessage());
        }
    }
}
