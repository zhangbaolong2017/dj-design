package com.bj58.daojia.observer.impl;

import com.bj58.daojia.observer.Observer;

/**
 * Created by 58 on 2015-10-16.
 */
public class ObserverNumTwo implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverNumTwo has received!");
    }
}
