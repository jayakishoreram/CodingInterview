package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("aab", "bbb"));
    }

    private static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> dictionaryStoT = new HashMap<>();
        Map<Character, Character> dictionaryTtoS = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if((dictionaryStoT.containsKey(s.charAt(i)) && !dictionaryStoT.get(s.charAt(i)).equals(t.charAt(i)))
                    || (dictionaryTtoS.containsKey(t.charAt(i)) && !(dictionaryTtoS.get(t.charAt(i)).equals(s.charAt(i))))){
                    return false;
                }else{
                dictionaryStoT.put(s.charAt(i), t.charAt(i));
                dictionaryTtoS.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }

    //Optimistic
    public boolean isIsomorphic2(String s, String t) {
        int m1[] = new int[256];
        int m2[] = new int[256];
        for(int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if(m1[s1] != m2[t1]) return false;
            m1[s1] = i + 1;
            m2[t1] = i + 1;
        }
        return true;
    }
}
