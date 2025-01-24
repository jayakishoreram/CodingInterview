package com.leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
        int[] b = {4,5,6};
        mergeSortedArray(a,b);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    private static void mergeSortedArray(int[] arr1, int[] arr2){
        for(int i = 0, j = 0; i < arr1.length;i++){
            if(arr1[i] > arr2[j]){
                shiftRight(arr1, i);
                arr1[i] = arr2[j];
                j++;
            }else if(arr1[i] == 0){
                arr1[i] = arr2[j];
                j++;
            }
        }
    }

    private static void shiftRight(int[] arr, int index){
        for(int i = arr.length - 2 ; i >= index ; i--){
            arr[i + 1] = arr[i];
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++)  {
            nums1[i + m ] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
