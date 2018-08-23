package com.zbl.demo.avl;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class AvlTreeNode<T extends Comparable> {
    //左子树
    public AvlTreeNode<T> left;
    //右子树
    public AvlTreeNode<T> right;

    public T data;
    //叶子节点高度为0
    public int height;

    public AvlTreeNode(T data) {
        this.data = data;
    }

    public AvlTreeNode(AvlTreeNode<T> left, AvlTreeNode<T> right, int height) {
        this.left = left;
        this.right = right;
        this.height = height;
    }

    public AvlTreeNode(AvlTreeNode<T> left, AvlTreeNode<T> right, T data, int height) {
        this.left = left;
        this.right = right;
        this.data = data;
        this.height = height;
    }

    public AvlTreeNode<T> singleRotateLeft(AvlTreeNode<T> x) {
        AvlTreeNode<T> w = x.left;
        x.left = w.right;
        w.right = x;
        x.height = Math.max(x.left.height, x.right.height) + 1;
        w.height = Math.max(w.left.height, x.height) + 1;
        return w;

    }

    public AvlTreeNode<T> singleRotateRight(AvlTreeNode<T> w) {
        AvlTreeNode<T> x = w.right;
        w.right = x.left;
        x.left = w;

        w.height = Math.max(w.left.height,w.right.height)+1;
        x.height = Math.max(x.left.height,w.height)+1;
        return x;
    }

    public AvlTreeNode<T> doubleRotateWithLeft(AvlTreeNode<T> x){
        x.left = singleRotateRight(x.left);
        return singleRotateLeft(x);
    }

    public AvlTreeNode<T> doubleRotateWithRight(AvlTreeNode<T> x){
        x.right = singleRotateLeft(x.right);
        return singleRotateRight(x);
    }
}
