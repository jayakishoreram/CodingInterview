package com.leetcode.dp;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = {2,1,1,2};
        //System.out.println(maxRob(0, houses));

        int[] memo = new int[houses.length + 1];
        Arrays.fill(memo, -1);
        System.out.println(maxRob(0, houses,memo));
    }

    private static int maxRob(int i, int[] houses){
        if(i >= houses.length){
            return 0;
        }
        return Math.max(maxRob(i + 1, houses), maxRob(i + 2, houses) + houses[i]);
    }

    private static int maxRob(int i, int[] houses, int[] memo){
        if(i >= houses.length){
            return 0;
        }
        if(memo[i] > -1){
            return memo[i];
        }
        int result = Math.max(maxRob(i + 1, houses), maxRob(i + 2, houses) + houses[i]);
        memo[i] = result;
        return memo[i];
    }
}
