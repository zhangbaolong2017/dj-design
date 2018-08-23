package com.bj58.daojia.observer.impl;

import com.bj58.daojia.observer.Observer;
import com.bj58.daojia.observer.Subject;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by 58 on 2015-10-16.
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector=new Vector<Observer>();

    /**
     * ���ӹ۲���
     * @param observer
     */
    public void add(Observer observer){
        vector.add(observer);
    }

    /**
     * ɾ���۲���
     * @param observer
     */
    public void del(Observer observer){
        vector.remove(observer);
    }

    /**
     * ֪ͨ���еĹ۲���
     */
    public void notifyObservers(){
        Enumeration<Observer> enumo= vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }

}
