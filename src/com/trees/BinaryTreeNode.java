package com.trees;

public class BinaryTreeNode {

    private int data;
    private BinaryTreeNode leftNode = null;
    private BinaryTreeNode rightNode = null;

    public BinaryTreeNode(){

    }
    public BinaryTreeNode(int data){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public BinaryTreeNode(int data, BinaryTreeNode leftNode, BinaryTreeNode rightNode){
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
