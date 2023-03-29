package com.designpatterns.observer.Observer;

import com.designpatterns.observer.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    private String userName;
    private StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable) {
        this.observable = observable;
        this.userName = emailId;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, " product is available");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to " + userName);
    }
}
