package com.leetcode.backtracking;

import java.util.*;

public class CombinationsOfPhoneNumber {

    private static List<String> combinations = new ArrayList<>();
    private static Map<Character, String> letters = Map.of(
            '2', "abc",
            '3',"def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7',"pqrs",
            '8', "tuv",
            '9', "wxyg"
    );

    private static String phoneDigits;

    public static void main(String[] args) {
        System.out.println(letterCombinations("2345"));
        //System.out.println(Arrays.toString(letterCombinationsSeq("23")));

    }

    private static String[] letterCombinationsSeq(String digits){
        if(null == digits || digits.isEmpty()){
            return new String[0];
        }

        if(digits.length() == 1){
            String[] array = new String[4];
            int i = 0;
            for(char c: letters.get(digits.charAt(0)).toCharArray()){
                array[i++] = String.valueOf(c);
            }
        }
        if(digits.length() == 2) {
            String[] array = new String[9];
            String s1 = letters.get(digits.charAt(0));
            String s2 = letters.get(digits.charAt(1));
            int i = 0;
            for (Character c : s1.toCharArray()) {
                for (Character c1 : s2.toCharArray()) {
                    array[i++] = String.valueOf(c.toString().concat(c1.toString()));
                }
            }
            return array;
        }
        return null;
    }


    private static List<String> letterCombinations(String digits){
        if(digits == null || digits.isEmpty()){
            return combinations;
        }
        phoneDigits = digits;
        backtrack(0, new StringBuilder());
        return combinations;
    }

    private static void backtrack(int i, StringBuilder path){
        if(path.length() == phoneDigits.length()){
            combinations.add(path.toString());
            return;
        }
        for(Character c: letters.get(phoneDigits.charAt(i)).toCharArray()){
            path.append(c);
            //System.out.println("I: "+ i + " PATH: "+ path);
            backtrack(i + 1, path);
            //System.out.println("BACKTRACK1 I: "+ i + " PATH: "+ path);
            path.deleteCharAt(path.length() - 1);
            //System.out.println("BACKTRACK2 I: "+ i + " PATH: "+ path);
        }
    }

    public List<String> letterCombinationsBest(String digits) {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return res;
        }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, digitToLetters);

        return res;
    }

    private void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> digitToLetters) {
        if (idx == digits.length()) {
            res.add(comb.toString());
            return;
        }

        String letters = digitToLetters.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}
