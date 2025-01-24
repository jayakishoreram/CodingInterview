package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] input = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(input);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        //Arrays.sort(nums);
        int boundry = nums.length - 1;
        int i = 0, j = 1, k = 2;
        int sum = 0;
        for(int count = 0; count < nums.length; count++){
            System.out.print(nums[count] + " ");
        }
        List<List<Integer>> result = new ArrayList<>();
        while(i < boundry - 2 || j < boundry - 1 || k < boundry){
            sum = nums[i] + nums[j] + nums[k];
            System.out.println("Sum: "+ sum);
            if(sum == 0){
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
            }
            if(k < boundry){
                k++;
            }else if(k == boundry && j < boundry - 1){
                j++;
            }else if((k == boundry) && (j == boundry - 1)){
                if(i < boundry - 2){
                    i++;
                    j = i+1;
                    k = j + 1;
                }
            }

        }
        return result;
    }
}
