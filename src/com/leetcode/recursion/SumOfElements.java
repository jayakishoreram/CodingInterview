package com.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SumOfElements {
    public static void main(String[] args) {
        int[] array = {3,1,2};
        List<Integer> ds = new ArrayList<>();
        combination(0, ds, array, 3);
    }

    private static void combination(int i, List<Integer> ds, int[] array, int sum){
        if(i >= array.length){
            Optional<Integer> sumOfElements = ds.stream().reduce(Integer::sum);
            if(sumOfElements.isPresent() && sumOfElements.get() == sum){
                System.out.println(ds);
            }
            return;
        }
        ds.add(array[i]);
        combination(i + 1, ds, array, sum);
        ds.removeLast();
        combination(i + 1, ds, array, sum);
    }
}
