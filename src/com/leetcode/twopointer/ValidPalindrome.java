package com.leetcode.twopointer;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("InPalindrom: "+ isValidPalindrome("A man, a plan, a canal: Panama"));
    }
    private static boolean isValidPalindrome(String statement){
        StringBuilder transformedChars = new StringBuilder();
        for(char c: statement.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(c)){
                transformedChars.append(c);
            }
        }
        System.out.println("transformed String: "+ transformedChars);
        char[] chars = transformedChars.toString().toCharArray();
        for(int i = 0, j = chars.length - 1; i <= j; i++,j--){
            if(chars[i] != chars[j]){
                return false;
            }
        }
        return true;
    }


    private static boolean isValidPalindrome2(String s){
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

