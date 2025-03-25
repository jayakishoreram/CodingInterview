package com.leetcode.backtracking;

public class Palindrome {
    public static void main(String[] args) {
        //System.out.println(palindromeUsingStringBuffer("abccba"));
        //System.out.println(palindromeSeq("abcaacba"));
        //System.out.println(palindromeRecursion("abcaacba"));
        System.out.println(palindromeInteger(1001));
    }

    private static boolean palindromeUsingStringBuffer(String word){
        return new StringBuffer(word).reverse().toString().equals(word);
    }

    private static boolean palindromeSeq(String word){
        char[] c = word.toCharArray();
        for(int i = 0; i < word.length() / 2; i++){
            if(c[i] != c[word.length() - i - 1]){
                return false;
            }
        }
        return true;
    }

    private static boolean palindromeRecursion(String word){
        StringBuilder reverse = new StringBuilder();
        reverse.append(backtrack(word, reverse, 0));
        System.out.println(word + ":" +reverse);
        return word.contentEquals(reverse);
    }

    private static char backtrack(String word, StringBuilder reverse, int index){
        if(index == word.length() - 1){
            return word.charAt(word.length() - 1);
        }
        reverse.append(backtrack(word, reverse, index + 1));
        return word.charAt(index);
    }

    private static boolean palindromeInteger(int x){
        if(x < 0 || (x % 10 == 0 && x!= 0 )){
            return false;
        }
        int x1 = x;
        int reverse = 0;
        while (x1 > 0){
            reverse = reverse * 10 + x1 % 10;
            x1 = x1 / 10;
        }
        return x == reverse;
    }
}
