package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class AllCombination {
    private static int n;
    private static int k;

    public static void main(String[] args) {
        List<List<Integer>> allComb = combine(3, 2);
        for(List<Integer> comb : allComb){
            System.out.print(comb);
        }
    }

    public static List<List<Integer>> combine(int n1, int k1) {
        n = n1;
        k = k1;
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new ArrayList<>(),  ans);
        return ans;
    }

    public static void backtrack(
            List<Integer> curr,
            List<List<Integer>> ans
    ) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int num = 1; num <= n; num++) {
            curr.add(num);
            backtrack(curr, ans);
            curr.remove(curr.size() - 1);
        }
        return;
    }
}
