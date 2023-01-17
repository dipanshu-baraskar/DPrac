package com.callback;

public class CallMe implements InterestingEvent {
    private EventNotifier eventNotifier;

    public CallMe() {
        eventNotifier = new EventNotifier(this);
    }

    @Override
    public void interestingEvent() {
        System.out.println("Call me impl");
    }
}
