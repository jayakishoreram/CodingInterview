package com.leetcode.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        //int[] array = {100,4,200,1,3,2};
        int[] array = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive3(array));
    }
    //Brute Force
    private static int longestConsecutive(int[] nums){
        if(null == nums || nums.length ==0){
            return 0;
        }
        int longestConsecutive = 0;
        for(int n: nums){
            int currentConsecutive = 0;
            int current = n;
            while(findConsecutive(nums, current++)){
                currentConsecutive++;
            }
            if(currentConsecutive > longestConsecutive){
                longestConsecutive = currentConsecutive;
            }
        }
        return ++longestConsecutive;
    }

    private static boolean findConsecutive(int[] nums, int num){
        for(int i: nums){
            if(i == num + 1){
                return true;
            }
        }
        return false;
    }

    //Brute Force with Set
    private static int longestConsecutive2(int[] nums){
        if(null == nums || nums.length ==0){
            return 0;
        }
        Set<Integer> dictionary = new HashSet<>();
        for(int n: nums){
            dictionary.add(n);
        }
        int longestConsecutive = 0;
        for(int n: nums){
            int currentConsecutive = 1;
            if(dictionary.contains(n - 1)){
                continue;
            }
            int current = n;
            while(dictionary.contains(++current)){
                currentConsecutive++;
            }
            longestConsecutive = Math.max(currentConsecutive, longestConsecutive);
        }
        return longestConsecutive;
    }

    //Sorted
    private static int longestConsecutive3(int[] nums){
        if(null == nums || nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);
        int longestConsecutive = 0;
        int currentConsecutive = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                continue;
            }
            if((nums[i] != nums[i - 1] + 1)){
                longestConsecutive = Math.max(longestConsecutive, currentConsecutive);
                currentConsecutive = 0;
            }else{
                currentConsecutive++;
            }
        }
        longestConsecutive = Math.max(longestConsecutive, currentConsecutive);
        return ++longestConsecutive;
    }
}
