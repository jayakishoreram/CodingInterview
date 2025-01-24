package com.trees;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryTree {

    public static BinaryTreeNode generateBinaryTree(){
        int[] data = {1,2,3,4,5,6,7};
        List<BinaryTreeNode> nodeList = new ArrayList<>();
        for(int i = 0; i< data.length; i++){
            nodeList.add(new BinaryTreeNode(data[i]));
        }

        nodeList.get(0).setLeftNode(nodeList.get(1));
        nodeList.get(0).setRightNode(nodeList.get(2));

        nodeList.get(1).setLeftNode(nodeList.get(3));
        nodeList.get(1).setRightNode(nodeList.get(4));
        nodeList.get(2).setLeftNode(nodeList.get(5));
        nodeList.get(2).setRightNode(nodeList.get(6));
        return nodeList.get(0);
    }
}
