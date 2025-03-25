package com.leetcode.recursion;

public class Palindrome {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array2 = {1,2,3,2,1};
        int[] array3 = {1,2,3,4,5,6};
        int[] array4 = {0,1,2,2,1,0};

        System.out.println(isPalindrome(0, array4));
    }

    private static boolean isPalindrome(int index, int[] array){
        if(index > array.length / 2){
            return true;
        }
        if(array[index] != array[array.length - index - 1]){
            return false;
        }
        return isPalindrome(index + 1, array);
    }
}
