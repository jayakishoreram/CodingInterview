package com.leetcode.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        rotateArray2(array, 1);
        Arrays.stream(array).forEach(System.out::print);
    }

    //Brute Force
    private static  void rotateArray(int[] a, int position){
        position = position % a.length;
        for(int i = 0; i < position; i++ ){
            int temp = a[a.length - 1];
            for(int j = a.length - 1; j > 0; j--){
                a[j] = a[j-1];
            }
            a[0] = temp;
        }
    }

    //Brute Force
    private static  void rotateArray2(int[] a, int position){
        position = position % a.length;
        System.out.println("position: "+ position);
        int[] temp = new int[position];
        for(int i = a.length - 1, j = 0; i > a.length - 1 - position; i--, j++){
            temp[j] = a[i];
        }
        System.out.println("temp.length: "+ temp.length);
        for(int j = a.length - 1; j >= position; j--){
            a[j] = a[j-position];
        }
        for(int i = 0; i < position; i++) {
            a[i] = temp[i];
        }
    }
}
