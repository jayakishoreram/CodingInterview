package com.trees.traversal;

import com.trees.BinaryTreeNode;
import com.trees.GenerateBinaryTree;

public class LCA {

    public static void main(String[] args) {
        BinaryTreeNode lca = findLeastCommonAnsister(GenerateBinaryTree.generateBinaryTree(), new BinaryTreeNode(4), new BinaryTreeNode(10));
        System.out.println("LCA: "+ lca.getData());

    }

    public static BinaryTreeNode findLeastCommonAnsister(BinaryTreeNode root, BinaryTreeNode n1, BinaryTreeNode n2){
        if(null == root){
            return null;
        }
        if(root.getData() == n1.getData() || root.getData() == n2.getData()){
            return root;
        }

        BinaryTreeNode left = findLeastCommonAnsister(root.getLeftNode(), n1, n2);
        BinaryTreeNode right = findLeastCommonAnsister(root.getRightNode(), n1, n2);
        if(null != left && null != right){
            return root;
        }
        return left != null ? left : right;
    }

}
