package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class Isomarphic {
    public boolean isIsomorphic(String s, String t) {
        if(!(s.length() == t.length())){
            return false;
        }
        Map<Character, Character> d = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(d.containsKey(s.charAt(i)) && d.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }else{
                d.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
