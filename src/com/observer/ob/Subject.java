package com.observer.ob;

public interface Subject {
    void registerObserver(Observer o);

    void unregisterObserver(Observer o);

    void notifyObservers();
}

