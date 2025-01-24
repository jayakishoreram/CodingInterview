package com.trees.traversal;

import com.trees.BinaryTreeNode;
import com.trees.GenerateBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("PostOrder");
        postOrderTraversal(GenerateBinaryTree.generateBinaryTree());

        System.out.println("PostOrder - Non recurssive");
        postOrderTraversalNR(GenerateBinaryTree.generateBinaryTree());
    }

    public static void postOrderTraversal(BinaryTreeNode root){
        if(null != root){
            postOrderTraversal(root.getLeftNode());
            postOrderTraversal(root.getRightNode());
            System.out.print(root.getData());
        }
    }

    public static void postOrderTraversalNR(BinaryTreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        if(null == root){
            System.out.println("No nodes in tree");
            return;
        }
        BinaryTreeNode prev = null;
        stack.push(root);
        while(!stack.empty()){
            BinaryTreeNode current = stack.peek();
            if(null == prev || prev.getLeftNode() == current || prev.getRightNode() == current){
                if(null != current.getLeftNode()){
                    stack.push(current.getLeftNode());
                }else if(null != current.getRightNode()){
                    stack.push(current.getRightNode());
                }
            } else if (current.getLeftNode() == prev) {
                if(null != current.getRightNode()){
                    stack.push(current.getRightNode());
                }
            }else {
                result.add(current.getData());
                stack.pop();
            }
            prev = current;
        }
        System.out.println(result);
    }
}
