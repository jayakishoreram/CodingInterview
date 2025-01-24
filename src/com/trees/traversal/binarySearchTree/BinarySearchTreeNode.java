package com.trees.traversal.binarySearchTree;

import com.trees.BinaryTreeNode;

public class BinarySearchTreeNode extends BinaryTreeNode {

    private int data;
    private BinarySearchTreeNode leftNode = null;
    private BinarySearchTreeNode rightNode = null;
    public BinarySearchTreeNode(int data){
        super(data);
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public BinarySearchTreeNode(){
        super();
    }

    public BinarySearchTreeNode(int data, BinarySearchTreeNode leftNode, BinarySearchTreeNode rightNode){
        super(data, leftNode, rightNode);
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

    public BinarySearchTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinarySearchTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinarySearchTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinarySearchTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
