package com.designpatterns.observer;

import com.designpatterns.observer.Observable.IphoneObservableImpl;
import com.designpatterns.observer.Observable.StockObservable;
import com.designpatterns.observer.Observer.EmailAlertObserverImpl;
import com.designpatterns.observer.Observer.MobileAlertObserverImpl;
import com.designpatterns.observer.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("pqr@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username ", iphoneStockObservable);
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);

        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);



    }
}
