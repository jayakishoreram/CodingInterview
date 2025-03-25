package com.leetcode.array;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        //int[] array = {3,0,6,1,5};
        //int[] array = {0};
        int[] array = {0,0,2};
        System.out.println(hIndex(array));
    }

    private static int hIndex(int[] a){
        Arrays.sort(a);
        int i  = a.length - 1;
        int hIndex = 0;
        while(i >= 0){
            if(a[i] > hIndex){
                hIndex++;
            }
            i--;
        }
        return hIndex;
    }
}
