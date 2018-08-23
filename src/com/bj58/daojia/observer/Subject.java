package com.bj58.daojia.observer;

/**
 * Created by 58 on 2015-10-16.
 */
public interface Subject {
    /**
     * ���ӹ۲���
     * @param observer
     */
    public void add(Observer observer);

    /**
     * ɾ���۲���
     * @param observer
     */
    public void del(Observer observer);

    /**
     * ֪ͨ���еĹ۲���
     */
    public void notifyObservers();

    /**
     * �������
     */
    public void operation();

}
