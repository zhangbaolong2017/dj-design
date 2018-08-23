package com.zbl.demo.algorithm.skip;

import java.util.Random;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SkipList<T extends Comparable<? super T>> {
    //头尾
    private SkipNode<T> head, tail;
    //节点总数
    private int nodes;
    //层数
    private int listLevel;
    //随机因子
    private Random random;

    //向上提升的一个概率
    private static final double PROB = 0.5;

    public SkipList() {
        random = new Random();
        clear();
    }


    /**
     * 水平双向链接
     *
     * @param node1
     * @param node2
     */
    private void horizontalLink(SkipNode<T> node1, SkipNode<T> node2) {
        node1.right = node2;
        node2.left = node1;
    }

    /**
     * 垂直双向链接
     *
     * @param node1
     * @param node2
     */
    private void vertiacallLink(SkipNode<T> node1, SkipNode<T> node2) {
        node1.down = node2;
        node2.up = node1;
    }

    /**
     * node1后插入node2
     *
     * @param node1
     * @param node2
     */
    private void backLink(SkipNode<T> node1, SkipNode<T> node2) {
        node2.left = node1;
        node2.right = node1.right;
        node1.right.left = node2;
        node1.right = node2;
    }

    //清空跳跃表
    public void clear() {
        head = new SkipNode<T>(SkipNode.HEAD_KEY, null);
        tail = new SkipNode<T>(SkipNode.TAIL_KEY, null);
        horizontalLink(head, tail);
        listLevel = 0;
        nodes = 0;
    }

    public boolean isEmpty() {
        return nodes == 0;
    }

    public int size() {
        return nodes;
    }

    private SkipNode<T> findNode(int key) {
        SkipNode<T> p = head;
        while (true) {
            while (p.right.key != SkipNode.TAIL_KEY && p.right.key <= key) {
                p = p.right;
            }
            if (p.down != null) {
                p = p.down;
            } else {
                break;
            }
        }
        return p;
    }

    public SkipNode<T> search(int key) {
        SkipNode<T> p = findNode(key);
        if (key == p.getKey()) {
            return p;
        } else {
            return null;
        }
    }

    public void put(int k, T v) {
        SkipNode<T> p = findNode(k);
        if (k == p.getKey()) {
            p.value = v;
            return;
        }
        SkipNode<T> q = new SkipNode<T>(k, v);
        backLink(p, q);
        //当前所在的层级是0
        int currentLevel = 0;
        //抛硬币
        while (random.nextDouble() < PROB) {
            //如果超出了高度，需要创建一个顶层
            if (currentLevel >= listLevel) {
                listLevel++;
                SkipNode<T> p1 = new SkipNode<T>(SkipNode.HEAD_KEY, null);
                SkipNode<T> p2 = new SkipNode<T>(SkipNode.TAIL_KEY, null);
                horizontalLink(p1, p2);
                vertiacallLink(p1, head);
                vertiacallLink(p2, tail);
                head = p1;
                tail = p2;
            }
            //将P移动上一层
            while (p.up == null) {
                p = p.left;
            }
            p = p.up;
            //只保存key
            SkipNode<T> e = new SkipNode<T>(k,null);
            //将e插入到p的后面
            backLink(p,e);
            //将e和q上下链接
            vertiacallLink(e,q);
            q=e;
            currentLevel++;
        }
        //层数递增
        nodes++;
    }

}
