package com.designpatterns.observer.Observer;

import com.designpatterns.observer.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    private String email;
    private StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(email, " product is in stock");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("mail sent to: " + emailId);
    }
}
