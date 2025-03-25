package com.leetcode.twopointer;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbsd"));
    }

    private static boolean isSubsequence(String s, String t){
        if(s.isEmpty()){
            return true;
        }
        if(t.isEmpty()){
            return false;
        }
        int i = 0;
        for(char c: t.toCharArray()){
            if(s.charAt(i) == c){
                if(i == s.length() - 1){
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
