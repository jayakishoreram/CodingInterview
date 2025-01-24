package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> repo = new HashMap<>();
        for(Character c : magazine.toCharArray()){
            if(repo.keySet().contains(c)){
                repo.put(c, repo.get(c) + 1);
            }else{
                repo.put(c, 1);
            }
        }

        for(Character c : ransomNote.toCharArray()){
            if(repo.keySet().contains(c)){
                if(repo.get(c) > 0){
                    repo.put(c, repo.get(c) - 1);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
