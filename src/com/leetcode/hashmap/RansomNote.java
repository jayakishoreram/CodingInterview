package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
    }

    private static boolean canConstruct(String ransomNote, String magazine){
        Map<Character, Integer> dictionary = new HashMap<>();
        for(char c: magazine.toCharArray()){
            int count = dictionary.getOrDefault(c, 0);
            dictionary.put(c, ++count);
        }
        for(char c: ransomNote.toCharArray()){
            int count = dictionary.getOrDefault(c,0);
            if(count == 0){
                return false;
            }
            dictionary.put(c, --count);
        }
        return true;
    }

    //More optimistic
    public static boolean canConstruct2(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            letters[c - 'a']--;
            if (letters[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}


