package com.bj58.daojia.test;

import com.bj58.daojia.observer.Subject;
import com.bj58.daojia.observer.impl.MySubject;
import com.bj58.daojia.observer.impl.ObserverNumOne;
import com.bj58.daojia.observer.impl.ObserverNumTwo;

/**
 * Created by 58 on 2015-10-16.
 */
public class ObserverTest {
    public static void main(String[] args){
        Subject sub=new MySubject();
        sub.add(new ObserverNumOne());
        sub.add(new ObserverNumTwo());
        sub.operation();
    }
}
