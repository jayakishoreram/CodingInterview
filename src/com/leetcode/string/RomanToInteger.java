package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static Map<String, Integer> romMap = new HashMap<>();

    static{
        romMap.put("I", 1);
        romMap.put("V", 5);
        romMap.put("X", 10);
        romMap.put("L", 50);
        romMap.put("C", 100);
        romMap.put("D", 500);
        romMap.put("M", 1000);
    }
    public int romanToInt(String s) {
        int result = 0;
        for(char c : s.toCharArray()){
            result += romMap.get(c+"");
        }

        for(int i = 1; i< s.length(); i++){
            if(romMap.get(s.charAt(i - 1) + "") < romMap.get(s.charAt(i) + "")){
                result -= romMap.get(s.charAt(i - 1) + "");
                result -= romMap.get(s.charAt(i - 1) + "");
            }
        }

        return result;
    }
}
