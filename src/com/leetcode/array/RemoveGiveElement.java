package com.leetcode.array;

public class RemoveGiveElement {

    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,3,4,5,6,7,8,9,0};
        int index = removeElement(a, 3);
        Util.printArray(a, index);
    }

    private static int removeElement(int[] a, int k){
        int index = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != k){
                a[index] = a[i];
                index++;
            }
        }
        return index;
    }
}
