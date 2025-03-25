package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CombinationSum {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        //combinationSum(IntStream.of(2,3,6,7).toArray(), 7, result, new ArrayList<>());
        combinationSumOptimistic(IntStream.of(2,3,6,7).toArray(), 7, result, new ArrayList<>(), 0);
        System.out.println(result);
    }

    private static void combinationSum(int[] candidates, int sum, List<List<Integer>> result, List<Integer> combination){
        int combinationSum = combination.stream().reduce(0, Integer::sum);
        if(combinationSum == sum ){
            result.add(List.copyOf(combination));
            return;
        }else if(combinationSum > sum){
            return;
        }
        for(int i = 0; i < candidates.length; i++){
            if(combination.isEmpty() || combination.stream().max(Integer::compareTo).get() <= candidates[i]){
                combination.add(candidates[i]);
                combinationSum(candidates, sum, result, combination);
                combination.removeLast();
            }
        }
    }

    private static void combinationSumOptimistic(int[] candidates, int sum, List<List<Integer>> result, List<Integer> combination, int position){
        if(sum == 0){
            result.add(List.copyOf(combination));
            return;
        }else if(sum < 0 ){
            return;
        }
        for(int i = position; i < candidates.length; i++){
            combination.add(candidates[i]);
            combinationSumOptimistic(candidates, sum - candidates[i], result, combination, i);
            combination.removeLast();
        }
    }
}
