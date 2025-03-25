package com.leetcode.recursion;


import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int[] array = {3,1,2};
        List<Integer> ds = new ArrayList<>();
        combination(0, ds, array);
    }

    private static void combination(int i, List<Integer> ds, int[] array){
        if(i >= array.length){
            System.out.println(ds);
            return;
        }
        ds.add(array[i]);
        combination(i + 1, ds, array);
        ds.removeLast();
        combination(i + 1, ds, array);
    }
}
