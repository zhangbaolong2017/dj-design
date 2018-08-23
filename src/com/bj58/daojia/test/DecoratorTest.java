package com.bj58.daojia.test;

import com.bj58.daojia.decorator.Sourceable;
import com.bj58.daojia.decorator.impl.Decorator;
import com.bj58.daojia.decorator.impl.Source;

/**
 * Created by 58 on 2015-10-16.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source=new Source();
        Sourceable de=new Decorator(source);
        de.method();
    }
}
