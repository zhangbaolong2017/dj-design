package com.bj58.daojia.observer.impl;

/**
 * Created by 58 on 2015-10-16.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
