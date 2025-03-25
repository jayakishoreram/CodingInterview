package com.leetcode.string;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println("Reverse Words: : "+ reverseWords("a good   example"));
    }

    private static String reverseWords(String statement){
        String[] words = statement.split(" ");
        StringBuilder reverseWords = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            if(words[i].trim().isEmpty()){
                continue;
            }
            reverseWords.append(words[i].trim()).append(" ");
        }
        return reverseWords.toString().trim();
    }
}
