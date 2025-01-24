package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

//128. Longest Consecutive
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> repo = new HashSet<>();
        for(Integer i : nums){
            repo.add(i);
        }
        int longStreek = 0;
        for(int num : nums){
            if(!repo.contains(num - 1)){
                int cStreek = 1;
                int cNum = num;

                while(repo.contains(cNum + 1)){
                    cNum += 1;
                    cStreek += 1;
                }
                longStreek = Math.max(longStreek, cStreek);
            }

        }
        return longStreek;
    }
}
