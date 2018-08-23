package com.zbl.demo.avl;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class BinaryTreeNode {
    private Integer data;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;
    private BinaryTreeNode parentNode;


    public BinaryTreeNode(Integer data, BinaryTreeNode leftChild, BinaryTreeNode rightChild, BinaryTreeNode parentNode) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.parentNode = parentNode;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public BinaryTreeNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(BinaryTreeNode parentNode) {
        this.parentNode = parentNode;
    }

    public BinaryTreeNode putTreeNode(Integer key, BinaryTreeNode currentNode, BinaryTreeNode parentNode) {
        BinaryTreeNode result = null;
        if (currentNode == null) {
            result = new BinaryTreeNode(key,null,null,parentNode);
            return result;
        }
        if (key != null && key.equals(currentNode.getData())) {
            result = currentNode;
        } else if (key.compareTo(currentNode.getData()) < 0) {
            result = putTreeNode(key, currentNode.getLeftChild(), currentNode);
        } else {
            result = putTreeNode(key, currentNode.getRightChild(), currentNode);
        }
        return result;
    }


}
