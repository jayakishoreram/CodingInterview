package com.leetcode.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        //0,1,2,3,5,8,13
        System.out.println(findFibonacci(7));
    }

    private static int findFibonacci(int n){
        if(n <= 1 ){
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
