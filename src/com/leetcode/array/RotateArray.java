package com.leetcode.array;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int cache = 0;
        for(int i = 0; i < k; i++){
            cache = nums[nums.length - 1];
            for(int j = nums.length - 1; j > 0; j-- ){
                nums[j] = nums[j - 1];
            }
            nums[0] = cache;
        }
    }
}
