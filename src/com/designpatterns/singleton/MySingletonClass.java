package com.designpatterns.singleton;

public class MySingletonClass {
    private static MySingletonClass mMySingletonClass;

    private MySingletonClass() {

    }

    public static MySingletonClass getInstance() {
        if (mMySingletonClass == null) {
            mMySingletonClass = new MySingletonClass();
        }
        return mMySingletonClass;
    }
}
