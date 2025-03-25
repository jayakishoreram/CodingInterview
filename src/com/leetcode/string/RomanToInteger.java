package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    static Map<String, Integer> romanMap = new HashMap<>();
    static{
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 1);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("IV"));
    }

    /*
    1. Add all character values
    2. if left char value is less than right character, then we need to subtract the double
        value from result.
     */

    private static int romanToInteger(String roman){
        int result = 0;
        char[] romanArray = roman.toCharArray();
        for(char c : romanArray){
            result += romanMap.get(c+ "");
        }
        for(int i = 1; i < romanArray.length; i++){
            if(romanMap.get(romanArray[i - 1] + "") < romanMap.get(romanArray[i] + "")){
                result-=  romanMap.get(romanArray[i -1] + "")*2;
            }
        }
        return result;
    }
}
