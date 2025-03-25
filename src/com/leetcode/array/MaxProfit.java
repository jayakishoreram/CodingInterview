package com.leetcode.array;

public class MaxProfit {

    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        System.out.println("Max Profit: "+ maxProfit2(array));
    }

    //Brute Force
    private static int maxProfit(int[] a){
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[j] - a[i] > maxProfit){
                    maxProfit = a[j] - a[i];
                }
            }
        }
        return maxProfit;
    }

    //Single pass
    private static int maxProfit2(int[] a){
        int minValue = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++){
            if(minValue > a[i]){
                minValue = a[i];
            }else if(maxProfit < a[i] - minValue){
                maxProfit = a[i] - minValue;
            }
        }
        return maxProfit;
    }
}
