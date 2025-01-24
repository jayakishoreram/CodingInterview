package com.leetcode.string;

import java.util.*;

public class AnagramGroups {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        if(null == strs || strs.length == 0){
            return anagrams;
        }
        Map<String, List<String>> repo = new HashMap<>();

        for(String s : strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String key = String.valueOf(sArray);
            if(!repo.containsKey(key)){
                repo.put(key, new ArrayList<>());
            }
            repo.get(key).add(s);
        }
        anagrams.add(new ArrayList(repo.values()));
        return anagrams;
    }
}
