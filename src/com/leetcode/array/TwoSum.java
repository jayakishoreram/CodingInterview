package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSumUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> repo = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int sub = target - nums[i];
            if(repo.containsKey(sub)){
                return new int[] {repo.get(sub), i};
            }
            repo.put(nums[i], i);
        }
        return null;
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0, j = 1;
        while(i < numbers.length - 1){
            if(numbers[i] + numbers[j] == target){
                result[0] = ++i;
                result[1] = ++j;
                break;
            }
            if(numbers[i] + numbers[j] < target){
                j++;
            }
        }
        return result;
    }
}
