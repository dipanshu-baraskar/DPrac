package com.callback;

public class EventNotifier {
    private InterestingEvent interestingEvent;
    private boolean somethingHappened;

    public EventNotifier(InterestingEvent interestingEvent) {
        this.interestingEvent = interestingEvent;
        somethingHappened = true;
    }

    public void doWork() {
        if (somethingHappened) {
            System.out.println("something happened");
            interestingEvent.interestingEvent();
        }
    }
}
