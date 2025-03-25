package com.leetcode.math;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] input = {9,9};
        //Arrays.stream(plusOne(input)).forEach(System.out::print);
        Arrays.stream(plusOneOptimestic(input)).forEach(System.out::print);
    }

    private static int[] plusOneOptimestic(int[] digits){
        int n = digits.length;
        for(int i = n - 1; i >= 0; --i){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }

    private static int[] plusOne(int[] digits){
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(digits).forEach(stringBuilder::append);
        System.out.println(stringBuilder);
        int value = Integer.valueOf(stringBuilder.toString()).intValue() + 1;
        String s = Integer.toString(value);
        System.out.println(s);
        int[] result = new int[s.length()];
        int count = 0;
        for(char c: s.toCharArray()){
            result[count++] = Integer.parseInt(c+"");
        }
        return result;
    }
}
