package com.leetcode.array;

public class MaxProfit2 {
    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        System.out.println(maxProfit(array));
    }

    private static int maxProfit(int[] a){
        int maxProfit = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i] > a[i - 1]){
                maxProfit = maxProfit + (a[i] - a[i - 1]);
            }
        }
        return maxProfit;
    }
}
