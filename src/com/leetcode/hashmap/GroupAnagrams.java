package com.leetcode.hashmap;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] sArray = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(sArray));
    }

    private static List<List<String>> groupAnagrams(String[] strings){
        Map<String, List<String>> anagramsGroup = new HashMap<>();
        if(null == strings || strings.length == 0){
            return new ArrayList<>(anagramsGroup.values());
        }
        for(String s: strings){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            anagramsGroup.putIfAbsent(key, new ArrayList<>());
            anagramsGroup.get(key).add(s);
        }
        return new ArrayList<>(anagramsGroup.values());
    }
}
