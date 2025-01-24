package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class Anagaram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> repo  = new HashMap<>();

        for(Character c: s.toCharArray()){
            if(repo.containsKey(c)){
                repo.put(c, repo.get(c) + 1);
            }else{
                repo.put(c, 1);
            }
        }

        for(Character c: t.toCharArray()){
            if(!repo.containsKey(c)){
                return false;
            } else if(!(repo.get(c) > 0)){
                return false;
            }else{
                repo.put(c, repo.get(c) - 1);
            }
        }
        return true;
    }
}
