package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        System.out.println("Pattern: "+ pattern);
        System.out.println("String: "+ s);
        Map<Character, String> repo = new HashMap<>();
        String[] sArray = s.split(" ");

        for(int i = 0; i < pattern.length(); i++){
            Character c = pattern.charAt(i);
            System.out.println("Char: "+ c + " Word: "+ sArray[i]);
            if(repo.containsKey(c) && !repo.get(c).equals(sArray[i])){
                return false;
            }else{
                repo.put(c, sArray[i]);
            }
        }
        return true;
    }
}
