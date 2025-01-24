package com.recursion;

public class StringReverse {
    private static StringBuilder reverseString = new StringBuilder();
    public static void main(String[] args) {
        stringReverse("abcd".toCharArray(), 0, reverseString);
        System.out.println(reverseString);

    }

    private static void stringReverse(char[] s, int index, StringBuilder reverseString){
        if(null == s || index >= s.length){
            return;
        }
        stringReverse(s, index + 1, reverseString);
        reverseString.append(s[index]);
        //System.out.print(s[index]);
    }

}
