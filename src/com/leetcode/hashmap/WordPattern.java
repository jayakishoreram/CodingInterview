package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(isWordInPattern("abba", "dog dog dog dog"));
    }

    private static boolean isWordInPattern(String pattern, String word){
        Map<Character, String> patternMap = new HashMap<>();
        String[] words = word.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            Character c = pattern.charAt(i);
            if(patternMap.containsKey(c) && !words[i].equals(patternMap.get(c))){
                return false;
            } else{
                if(!patternMap.containsKey(c) && patternMap.containsValue(words[i])) {
                    return false;
                }
                patternMap.put(c, words[i]);
            }
        }
        return true;
    }
}
