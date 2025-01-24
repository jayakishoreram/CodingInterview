package com.leetcode.string;

import java.util.Arrays;
import java.util.Optional;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"flower","floor","fl"};
        String prefix = longestCommonPrefix_2(s);
        System.out.println(prefix);
    }

    public String longestCommonPrefix(String[] strs) {

        char[] fw = strs[0].toCharArray();
        String prefix = "";
        int i = 0;
        for(char c: fw){
            boolean isExist = true;
            for(String s: strs){
                if((s.length() < i) || (s.charAt(i) != c)){
                    isExist = false;
                    System.out.println(i + " " +s.charAt(i) +" "+c);
                }
            }
            i++;
            if(!isExist){
                return prefix;
            }else{
                prefix += c;
            }
        }
        return prefix;
    }

    private static String longestCommonPrefix_2(String[] sArray){
        Optional<String> min = Arrays.stream(sArray).sorted().findFirst();
        String shortString = min.get();
        StringBuilder b = new StringBuilder();
        for(Character c : shortString.toCharArray()){
            b.append(c+"");
            boolean isPrefix = true;
            for(String s: sArray){
                if(!s.startsWith(b.toString())){
                    isPrefix = false;
                    break;
                };
            }
            if(isPrefix) {
                b.toString();
            }else {
                return b.toString().substring(0, b.length()-1);
            }
        }
        return b.toString();
    }
}
