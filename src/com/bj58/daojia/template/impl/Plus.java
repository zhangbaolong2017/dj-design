package com.bj58.daojia.template.impl;

import com.bj58.daojia.template.AbstractCalculator;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
