package com.leetcode.string;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println("Length of last word: "+ lastWordLength2("  I   AM  A  HERO00   "));
    }

    private static int lastWordLength(String statement){
        String[] wordsArray = statement.split(" ");
        return wordsArray[wordsArray.length -1].length();
    }

    private static int lastWordLength2(String statement){
        String s = statement.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }

}
