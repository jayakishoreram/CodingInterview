package com.leetcode.math;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }

    private static int mySqrt(int n) {
        if(n == 0){
            return 0;
        }
        if(n < 2){
            return 1;
        }
        int maxAns = n / 2;
        for(int i = maxAns; i > 1; i--){
            if(i <= n/i){
                return i;
            }
        }
        return 1;
    }
}
