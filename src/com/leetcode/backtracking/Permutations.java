package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        permute(IntStream.of(1,2,3).toArray(), result, new ArrayList<>());
        System.out.println(result );
    }

    private static void permute(int[] nums, List<List<Integer>> result, List<Integer> combination){
        if(combination.size() == nums.length){
            result.add(List.copyOf(combination));
            return;
        }
        for (int num : nums) {
            if (!combination.contains(num)) {
                combination.add(num);
                permute(nums, result, combination);
                combination.removeLast();
            }
        }
    }
}
