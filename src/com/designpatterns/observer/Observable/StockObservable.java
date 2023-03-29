package com.designpatterns.observer.Observable;

import com.designpatterns.observer.Observer.NotificationAlertObserver;

public interface StockObservable {
     void add(NotificationAlertObserver observer);
     void remove(NotificationAlertObserver observer);
     void notifySubscribers();
     void setStockCount(int newStockAdded);
     int getStockCount();

}
