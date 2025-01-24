package com.trees.traversal;

import com.trees.BinaryTreeNode;
import com.trees.GenerateBinaryTree;

import java.util.*;

public class LevelOrderTraversal {

    public static void main(String[] args) {

        System.out.println("LevelOrder - non recursive");
        levelOrderTraversalNR(GenerateBinaryTree.generateBinaryTree());
    }

    public static void levelOrderTraversalNR(BinaryTreeNode root){
        List<Integer> result = new ArrayList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        if(null == root){
            System.out.println("No nodes in tree");
            return;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            BinaryTreeNode element = queue.poll();
            result.add(element.getData());
            if(null != element.getLeftNode()){
                queue.offer(element.getLeftNode());
            }
            if(null != element.getRightNode()){
                queue.offer(element.getRightNode());
            }

        }
        System.out.println(result);
    }
}
