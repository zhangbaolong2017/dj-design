package com.zbl.demo.algorithm;

import java.io.Serializable;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SeqStack<T> extends Stack<T> implements Serializable {
    private static final long serialVersionUID = -5413303117698554397L;

    private int top=-1;
    private int capacity = 10;
    private T[] array;

    private int size;

    public  SeqStack(int capacity){
       // TreeMap
    }

}
