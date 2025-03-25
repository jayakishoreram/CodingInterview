package com.leetcode.array;

public class JumpGame {
    public static void main(String[] args) {
        //int[] array = {2,3,1,1,4};
        //int[] array = {3,2,1,0,4};
        int[] array = {2,0};
        System.out.println(isJumpSuccess(array));
    }
     private static boolean isJumpSuccess(int[] a){
        int index = 0;
        while (index < a.length - 1){
            index = index + a[index];
            if( index < a.length && 0 == a[index]){
                return false;
            }
        }
        return index == a.length - 1;
     }
}
