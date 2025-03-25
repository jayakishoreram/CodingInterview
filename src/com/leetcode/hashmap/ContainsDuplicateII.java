package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {

    }
    private static boolean containsDuplicate(int[] nums, int k){
        Map<Integer, Integer> visited = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(visited.containsKey(nums[i]) && i - visited.get(nums[i]) <= k){
                return true;
            }
            visited.put(nums[i], i);
        }
        return false;
    }
}
