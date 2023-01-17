package com.thread;

public class RunnablePrac implements Runnable{

    private MessageListener  messageListener;

    public RunnablePrac(MessageListener messageListener) {
        this.messageListener = messageListener;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        messageListener.subscribe();
    }
}
