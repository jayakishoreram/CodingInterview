package com.leetcode.array;

public class ContainsNearbyDuplicate {
    //219. Contains Duplicate II
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length - k; i++){
            int p = i + k;
            for(int j = i + 1; j <= p; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
