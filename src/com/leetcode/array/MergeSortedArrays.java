package com.leetcode.array;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args){
        int[] a1 = {0};
        int[] a2 = {1};
        int[] a = mergeSortedArrays(a1, 0, a2,1);
        Arrays.stream(a).forEach(System.out::print);
    }

    private static int[] mergeSortedArrays(int[] a1, int m, int[] a2, int n){
        int p1 = m - 1;
        int p2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--){
            if(p2 < 0){
                break;
            }
            if(p1 >= 0 && a2[p2] > a1[p1]){
                a1[i] = a2[p2];
                p2--;
            }else if(p1 >= 0 && a2[p2] < a1[p1]){
                a1[i] = a1[p1];
                p1--;
            }else if(p1 >= 0 && a2[p2] == a1[p1]){
                a1[i] = a2[p2];i--;p2--;
                a1[i] = a1[p1];p1--;
            }else if(p1 < 0){
                a1[i] = a2[p2];
            }
        }
        return a1;
    }
}
