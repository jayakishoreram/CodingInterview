package com.trees.traversal;

import com.trees.BinaryTreeNode;
import com.trees.GenerateBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    public static void main(String[] args) {
        System.out.println("InOrder");
        inOrderTraversal(GenerateBinaryTree.generateBinaryTree());
        System.out.println("InOrder - non recursive");
        inOrderTraversalNR(GenerateBinaryTree.generateBinaryTree());
    }

    public static void inOrderTraversal(BinaryTreeNode root){
        if(null != root){
            inOrderTraversal(root.getLeftNode());
            System.out.print(root.getData());
            inOrderTraversal(root.getRightNode());
        }
    }

    public static void inOrderTraversalNR(BinaryTreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        if(null == root){
            System.out.println("No nodes in tree");
            return;
        }
        BinaryTreeNode currentNode = root;
        boolean isDone = false;
        while(!isDone) {
            if (null != currentNode) {
                stack.push(currentNode);
                currentNode = currentNode.getLeftNode();
            } else {
                if (stack.empty()) {
                    isDone = true;
                } else {
                    currentNode = stack.pop();
                    result.add(currentNode.getData());
                    currentNode = currentNode.getRightNode();
                }
            }
        }
        System.out.println(result);
    }
}
