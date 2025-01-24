package com.trees.traversal.binarySearchTree;

import com.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KthSmallestElement {

    private static int  count = 0;
    private static int kthSmallest = 0;
    public static void main(String[] args) {
        inOrderTraversalKthSmallestElement(GenerateBinarySearchTree.generateBinarySearchTree(), 4);
        System.out.println(kthSmallest);
    }

    public static void inOrderTraversalKthSmallestElement(BinarySearchTreeNode root, int k){
        if(null != root){
            inOrderTraversalKthSmallestElement(root.getLeftNode(), k);
            count++;
            if (count == k)
                kthSmallest = root.getData();
            inOrderTraversalKthSmallestElement(root.getRightNode(), k);
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
