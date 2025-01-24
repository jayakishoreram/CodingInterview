package com.trees.traversal;

import com.trees.BinaryTreeNode;
import com.trees.GenerateBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    public static void main(String[] args) {
        System.out.println("PreOrder");
        preOrderTraversal(GenerateBinaryTree.generateBinaryTree());
        System.out.println("PreOrder - non recursive");
        preOrderTraversalNR(GenerateBinaryTree.generateBinaryTree());
    }

    public static void preOrderTraversal(BinaryTreeNode root){
        if(null != root){
            System.out.print(root.getData());
            preOrderTraversal(root.getLeftNode());
            preOrderTraversal(root.getRightNode());
        }
    }

    public static void preOrderTraversalNR(BinaryTreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        if(null == root){
            System.out.println("No nodes in tree");
            return;
        }
        stack.push(root);
        while(!stack.empty()){
            BinaryTreeNode element = stack.pop();
            result.add(element.getData());
            if(null != element.getRightNode()){
                stack.push(element.getRightNode());
            }
            if(null != element.getLeftNode()){
                stack.push(element.getLeftNode());
            }
        }
        System.out.println(result);
    }
}
