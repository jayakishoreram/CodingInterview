package com.leetcode.twopointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(twoSum2(array, 4)));
    }

    //Brute force approach
    private static int[] twoSum(int[] array, int target){
        int[] result = new int[2];
      for(int i = 0; i< array.length; i++){
          for(int j = i + 1; j < array.length; j++){
              if(array[i] + array[j] == target){
                  result[0] = i;
                  result[1] = j;
                  return result;
              }
          }
      }
        return result;
    }

    private static int[] twoSum2(int[] array, int target){
        int[] result = new int[2];
        for(int i = 0, j = array.length - 1; i < j;){
            int sum = array[i] + array[j];
            if(sum == target){
                result[0] = ++i;
                result[1] = ++j;
                return result;
            }else if(sum > target) {
                j--;
            }else {
                i++;
            }
        }
        return result;
    }
}
