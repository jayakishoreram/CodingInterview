package com.leetcode.string;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] words = {"AB", "A"};
        System.out.println(findLongestCommonPrefix2(words));
    }

    private static String findLongestCommonPrefix(String[] words){
        StringBuilder prefix = new StringBuilder();
        char[] c =  words[0].toCharArray();
        for(int i = 0; i < c.length; i++){
            for(int j = 1; j < words.length; j++){
                if(words[j].length() <= i || c[i] != words[j].toCharArray()[i]){
                    return prefix.toString();
                }
                prefix.append(c[i]);
            }
        }
        return prefix.toString();
    }

    //Optimistic implementation
    private static String findLongestCommonPrefix2(String[] words) {
        if(words == null || words.length == 0) {
            return "";
        }
        String prefix = words[0];
        for(int i = 1; i < words.length; i++) {
            while(words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
