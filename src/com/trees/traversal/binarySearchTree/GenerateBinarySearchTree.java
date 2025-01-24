package com.trees.traversal.binarySearchTree;

import com.trees.traversal.InOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinarySearchTree {

    public static void main(String[] args) {
        InOrderTraversal.inOrderTraversal(generateBinarySearchTree());
        InOrderTraversal.inOrderTraversal(generateBinarySearchTree(new int[]{1, 2, 3, 4, 5, 6, 7}, 0, 6));
    }

    public static BinarySearchTreeNode generateBinarySearchTree(){
        int[] data = {1,2,3,4,5,6,7};
        List<BinarySearchTreeNode> nodeList = new ArrayList<>();
        for(int i = 0; i< data.length; i++){
            nodeList.add(new BinarySearchTreeNode(data[i]));
        }

        nodeList.get(3).setLeftNode(nodeList.get(1));
        nodeList.get(3).setRightNode(nodeList.get(5));

        nodeList.get(1).setLeftNode(nodeList.get(0));
        nodeList.get(1).setRightNode(nodeList.get(2));
        nodeList.get(4).setLeftNode(nodeList.get(4));
        nodeList.get(4).setRightNode(nodeList.get(6));
        return nodeList.get(3);
    }

    public static BinarySearchTreeNode generateBinarySearchTree(int[] array, int left, int right){
        if(left > right){
            return null;
        }
        BinarySearchTreeNode newNode = new BinarySearchTreeNode();
        if(left == right){
            newNode.setData(array[left]);
        }else{
            int mid = (left + right) / 2;
            newNode.setData(array[mid]);
            newNode.setLeftNode(generateBinarySearchTree(array, left, mid - 1));
            newNode.setRightNode(generateBinarySearchTree(array, mid + 1, right));
        }
        return newNode;
    }
}
