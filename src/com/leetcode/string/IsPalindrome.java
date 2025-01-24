package com.leetcode.string;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(sb +"  "+ sb.reverse());
        return sb.toString().equals(sb.reverse().toString());
    }
}
