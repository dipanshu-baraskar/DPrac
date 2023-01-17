package com.callback;

public class Runner {
    public static void main(String[] args) {
       CallMe callMe= new CallMe();
       callMe.interestingEvent();

       EventNotifier eventNotifier= new EventNotifier(callMe);
       eventNotifier.doWork();


    }
}
