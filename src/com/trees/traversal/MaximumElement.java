package com.trees.traversal;

import com.trees.BinaryTreeNode;
import com.trees.GenerateBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumElement {

    public static void main(String[] args) {

        System.out.println("Maximum element in tree: "+ findMaximum(GenerateBinaryTree.generateBinaryTree()));

    }

    public static Integer findMaximum(BinaryTreeNode root){
        int max = Integer.MIN_VALUE;
        if(null != root){
            Integer leftMax = findMaximum(root.getLeftNode());
            Integer rightMax = findMaximum(root.getRightNode());
            max = leftMax > rightMax ? leftMax : rightMax;
            max = Math.max(root.getData(), max);
        }
        return max;
    }

    public static Integer findMaximumNR(BinaryTreeNode root){
        Integer max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        if(null == root){
            System.out.println("No nodes in tree");
            return Integer.MIN_VALUE;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            BinaryTreeNode element = queue.poll();
            if(element.getData() > max){
                max = element.getData();
            }
            if(null != element.getLeftNode()){
                queue.offer(element.getLeftNode());
            }
            if(null != element.getRightNode()){
                queue.offer(element.getRightNode());
            }

        }
        return max;
    }
}
