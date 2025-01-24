package com.leetcode.array;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] preFix = new int[nums.length];
        int[] suFix = new int[nums.length];
        int[] result = new int[nums.length];
        preFix[0] = 1;
        for(int i = 1; i < nums.length; i++){
            preFix[i] = preFix[i - 1] * nums[i - 1];
        }
        suFix[nums.length - 1] = 1;

        for(int i = nums.length - 2; i >=0; i--){
            suFix[i] = suFix[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < preFix.length; i++){
            result[i] = preFix[i] * suFix[i];
            System.out.print(result[i] + ", ");
        }
        return result;
    }

    public int[] productExceptSelfV2(int[] nums) {
        int[] preFix = new int[nums.length];
        preFix[0] = 1;
        for(int i = 1; i < nums.length; i++){
            preFix[i] = preFix[i - 1] * nums[i - 1];
        }
        int suCache = 1;

        for(int i = nums.length - 1; i >=0; i--){

            preFix[i] = suCache * preFix[i];
            suCache *= nums[i];
        }

        for(int i = 0; i < preFix.length; i++){
            System.out.print(preFix[i] + ", ");
        }
        return preFix;
    }
}
