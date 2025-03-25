package com.leetcode.dp;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        //int[] memo = new int[n + 1];
        //System.out.println(climbStairs2(0, n, memo));
        //System.out.println(Arrays.toString(memo));
        System.out.println(climbStairs3(n));
    }
    private static int climbStairs(int i, int n){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        return climbStairs(i + 1, n) + climbStairs(i + 2, n);
    }

    private static int climbStairs2(int i, int n, int[] memo){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        if(memo[i] > 1){
            return memo[i];
        }
        memo[i] = climbStairs2(i + 1, n, memo) + climbStairs2(i + 2, n, memo);
        return memo[i];
    }

    private static int climbStairs3(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
