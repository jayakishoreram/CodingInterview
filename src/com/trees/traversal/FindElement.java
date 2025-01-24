package com.trees.traversal;

import com.trees.BinaryTreeNode;
import com.trees.GenerateBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindElement {

    public static void main(String[] args) {
        System.out.println("Find Element: " +  findElement(GenerateBinaryTree.generateBinaryTree() , 4));
        System.out.println("Find Element - non recursive: "+ findElementNR(GenerateBinaryTree.generateBinaryTree(), 10));

    }

    public static Boolean findElement(BinaryTreeNode root, Integer i){
        if(null != root){
            if(root.getData() == i){
                return true;
            }
            return findElement(root.getLeftNode(), i) || findElement(root.getRightNode(), i);
        }
        return false;
    }

    public static Boolean findElementNR(BinaryTreeNode root, Integer i){
        Stack<BinaryTreeNode> stack = new Stack<>();
        if(null == root){
            System.out.println("No nodes in tree");
            return false;
        }
        stack.push(root);
        while(!stack.empty()){
            BinaryTreeNode element = stack.pop();
            if(element.getData() == i){
                return true;
            }
            if(null != element.getRightNode()){
                stack.push(element.getRightNode());
            }
            if(null != element.getLeftNode()){
                stack.push(element.getLeftNode());
            }
        }
        return false;
    }
}
