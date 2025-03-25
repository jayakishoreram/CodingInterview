package com.leetcode.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(findTwoSumIndecis(nums, 9)));
    }

    private static int[] findTwoSumIndecis(int[] nums, int target){
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int c2 = target - nums[i];
            if(indexMap.containsKey(c2)){
                return new int[]{indexMap.get(c2), i};
            }
            indexMap.put(nums[i], i);
        }
        return null;
    }
}
