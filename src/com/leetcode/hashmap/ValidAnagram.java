package com.leetcode.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isValidAnagram2("ana","naa"));
    }

    private static boolean isValidAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> repo  = new HashMap<>();

        for(Character c: s.toCharArray()){
            int count = repo.getOrDefault(c,0);
            repo.put(c, ++count);
        }

        for(Character c: t.toCharArray()){
            int count = repo.getOrDefault(c,0);
            if(count == 0){
                return false;
            }
            repo.put(c, --count);
        }
        return true;
    }

    //Optimistic
    private static Boolean isValidAnagram2(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
}
