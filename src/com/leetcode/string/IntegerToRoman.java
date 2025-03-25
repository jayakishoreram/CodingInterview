package com.leetcode.string;

public class IntegerToRoman {

    static int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static void main(String[] args) {
        System.out.println(integerToRoman(840));
    }

    private static String integerToRoman(int a){
        StringBuilder roman = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while (a >= values[i]){
                roman.append(symbols[i]);
                a -= values[i];
            }
        }
        return roman.toString();
    }

}
