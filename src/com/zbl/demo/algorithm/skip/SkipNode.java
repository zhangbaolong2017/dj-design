package com.zbl.demo.algorithm.skip;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SkipNode<T> {
    public int key;
    public T value;
    //上下左右，四个指针
    public SkipNode<T> up, down, left, right;
    public static final int HEAD_KEY = Integer.MIN_VALUE;
    public static final int TAIL_KEY = Integer.MAX_VALUE;

    public SkipNode(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        Boolean flag = false;
        if (this == o) {
            flag = true;
            return flag;
        }
        if (o == null) {
            return flag;
        }
        if (!(o instanceof SkipNode<?>)) {
            return flag;
        }
        SkipNode<T> ent;
        try {
            //校验类型
            ent = (SkipNode<T>) o;
        } catch (ClassCastException ex) {
            return flag;
        }
        if ((ent.getKey() == key) && (ent.getValue() == value)) {
            flag = true;
        }
        return flag;
    }

    @Override
    public String toString() {
        return "key-value:" + key + value;
    }
}
