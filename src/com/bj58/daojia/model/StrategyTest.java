package com.bj58.daojia.model;

/**
 * Created by 58 on 2015-10-16.
 */
public class StrategyTest {
    public static void main(String[] args){
        AbstractCalculator cal=new Plus();
        int result=cal.calculate("8+8","\\+");
        System.out.print(result);
    }
}
