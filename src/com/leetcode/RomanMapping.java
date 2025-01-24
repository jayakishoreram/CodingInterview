package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanMapping {
    private static Map<Character, Integer> romanMap = new HashMap();
    public static void main(String[] args) {
        initRomanMap();
        int result = transform("IC");
        System.out.println("Result: "+ result);

    }

    private static void initRomanMap(){
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    private static Integer transform(String input){
            char[] charArray  = input.toCharArray();
            int sum = 0;
            int pre = 0;
            for(int i = 0; i < charArray.length; i++){
                sum += romanMap.get(charArray[i]);
                if(i>0)
                    pre = romanMap.get(charArray[i - 1]);
                if(pre < romanMap.get(charArray[i])){
                    sum -= pre;
                    sum -= pre;
                }
                }
        return sum;
    }
}
