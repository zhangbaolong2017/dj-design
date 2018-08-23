package com.bj58.daojia.observer;

/**
 * Created by 58 on 2015-10-16.
 */
public interface Subject {
    /**
     * 增加观察者
     * @param observer
     */
    public void add(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void del(Observer observer);

    /**
     * 通知所有的观察者
     */
    public void notifyObservers();

    /**
     * 自身操作
     */
    public void operation();

}
