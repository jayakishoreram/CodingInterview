package com.arrays;

import java.util.Arrays;

public class MergeSorterArraysBtoA {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0; i < 5; i ++){
            a[i] = i;
        }
        int[] b = {5,6,7,8,9};
        Arrays.stream(a).forEach(System.out::print);
        System.out.println();
        Arrays.stream(b).forEach(System.out::print);
        mergeArrays(a,5,b,5);
        System.out.println();
        Arrays.stream(a).forEach(System.out::print);
    }

    private static void mergeArrays(int[] a, int lastA, int[] b, int lastB){
       int mergeIndex = lastA + lastB -1;
       int indexA = lastA - 1;
       int indexB = lastB - 1;
       while(indexB >= 0){
           if(a[indexA] > b[indexB]){
               a[mergeIndex] = a[indexA--];
           }else{
               a[mergeIndex] = b[indexB--];
           }
           mergeIndex--;
       }

    }
}
