package com.java11;

import java.util.*;

public class StringChallange {
    public static void main(String[] args) {
        System.out.println(compressString("abbbccdef"));
    }

    private static boolean isStringUnique(String input){
        Set<Character> holdChar = new HashSet<>();
        for(int i = 0; i< input.length(); i++){
            if(holdChar.contains(input.charAt(i))){
                return false;
            }else{
                holdChar.add(input.charAt(i));
            }
        }
        return true;
    }

    private static boolean isStringPermutationV1(String input1, String input2){
        return sort(input1).equals(sort(input2));
    }

    private static String sort(String input){
        char[] sortedChars = input.toCharArray();
        Arrays.sort(sortedChars);
        return new String(sortedChars);
    }

    private static boolean isStringPermutationV2(String input1, String input2){
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(int i=0; i < input1.length(); i++){
            Character c = input1.charAt(i);
            if(charCountMap.containsKey(c)){
                charCountMap.computeIfPresent(c, (character, integer) -> integer + 1);
            }else{
                charCountMap.put(c, 1);
            }
        }

        for(int i=0; i < input2.length(); i++){
            Character c = input2.charAt(i);
            if(charCountMap.containsKey(c)){
                charCountMap.computeIfPresent(c, (character, integer) -> integer - 1);
            }else{
                return false;
            }
        }


        return !charCountMap.values().stream().filter(i -> i < 0).findAny().isPresent();
    }

    private static boolean isStringPalindrome(String input1){
        for(int i=0, j= input1.length() - 1; i < input1.length() && i < j; i++, j--) {
            Character c = input1.charAt(i);
            Character c1 = input1.charAt(j);
            if (!c.equals(c1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean inStringOneEdit(String input1, String input2){
        if(input1.length() == input2.length()){
            return checkReplace(input1, input2);
        }else if(!(Math.abs(input1.length() - input2.length()) > 1)){
            if(input1.length() > input2.length()){
                return checkReplace(input1.substring(0, input2.length()), input2);
            }else {
                return checkReplace(input1, input2.substring(0, input1.length()));
            }
        }
        return true;
    }

    private static boolean checkReplace(String input1, String input2){
        boolean ifFound = false;
        for(int i = 0 ; i < input1.length(); i++){
            if(input1.charAt(i) != input2.charAt(i)){
                if(ifFound){
                    return false;
                }
                ifFound = true;
            }
        }
        return true;
    }

    private static String compressString(String input){
        int count = 0;
        Character pre = null;
        StringBuilder out = new StringBuilder();
        int i = 0;
        /*for(int i = 0 ; i < input.length(); i++)*/do
        {
            Character c = input.charAt(i);
            if(null == pre){
                pre = c;
                count++;
            }else{
                if(pre.equals(c)){
                    count++;
                }else{
                    out.append(pre);
                    out.append(count);
                    pre = c;
                    count = 1;
                }
            }
            i++;
        }while (i < input.length());
        out.append(pre);
        out.append(count);
        return out.toString();
    }
}
