package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Combinations {
    public static void main(String[] args) {
        System.out.println(combinations(4, 3));
    }

    private static List<List<Integer>> combinations(int n, int numberOfElementsPerSet){
        List<Integer> numbers = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        IntStream.rangeClosed(1,n).forEach(numbers::add);
        System.out.println(numbers);
        backTrack(0, numbers, numberOfElementsPerSet, result, new ArrayList<>());
        //backTrackOptimistic(1, numberOfElementsPerSet, result, new ArrayList<>(), n);
        return result;
    }

    private static void backTrackOptimistic(Integer position, Integer numberOfElementsPerSet, List<List<Integer>> result, List<Integer> elementCombination, int n){
        if(elementCombination.size() == numberOfElementsPerSet){
            result.add(List.copyOf(elementCombination));
            return;
        }
        int i = position;
        while(i <= n) {
            elementCombination.add(i);
            backTrackOptimistic(i + 1, numberOfElementsPerSet, result, elementCombination, n);
            i++;
            elementCombination.removeLast();
        }
    }

    private static void backTrack(Integer position, List<Integer> numbers, Integer numberOfElementsPerSet, List<List<Integer>> result, List<Integer> elementCombination){
        //System.out.println("EC: " + elementCombination);
        if(elementCombination.size() == numberOfElementsPerSet){
            result.add(List.copyOf(elementCombination));
            return;
        }
        for(int i = position; i < numbers.size(); i++) {
            //int finalI = i;
            //if(!elementCombination.contains(numbers.get(i)) && elementCombination.stream().noneMatch(element -> element >= numbers.get(finalI))) {
            elementCombination.add(numbers.get(i));
            System.out.println("EC1****: " + elementCombination);
                backTrack(i + 1, numbers, numberOfElementsPerSet, result, elementCombination);
                elementCombination.removeLast();
           // }
        }
    }
}
