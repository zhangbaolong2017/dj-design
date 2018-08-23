package com.bj58.daojia.template.test;

import com.bj58.daojia.template.AbstractCalculator;
import com.bj58.daojia.template.impl.Plus;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
