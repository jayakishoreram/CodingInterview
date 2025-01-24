package com.trees.traversal.binarySearchTree;

public class InsertElement {

    public static void main(String[] args) {
        BinarySearchTreeNode root = GenerateBinarySearchTree.generateBinarySearchTree();
        insert(root, 8);
        System.out.println(root.getData());
    }

    private static void insert(BinarySearchTreeNode root, Integer i) {

        if(i < root.getData()){
            if(null != root.getLeftNode()){
                insert(root.getLeftNode(), i);
            }else{
                root.setLeftNode(new BinarySearchTreeNode(i));
            }
        }else if(i > root.getData()){
            if(null != root.getRightNode()){
                insert(root.getRightNode(), i);
            }else{
                root.setRightNode(new BinarySearchTreeNode(i));
            }
        }
    }
}
