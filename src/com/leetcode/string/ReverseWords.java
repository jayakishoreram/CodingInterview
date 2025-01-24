package com.leetcode.string;

public class ReverseWords {
    public static void main(String[] args) {
        String s = reverseWordsInString("This is my world");
        System.out.println(s);
    }

    private static String reverseWordsInString(String s){
        s = s.trim();
        String[] sSplit = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = sSplit.length - 1; i >= 0; i--){
            if(!sSplit[i].trim().isEmpty()){
                result.append(sSplit[i].trim()).append(" ");
            }
        }

        return result.toString().trim();
    }

    public String reverseWords(String s) {
        s = s.trim();
        String[] strA = s.split("\\s+");
        for(int i = 0; i < strA.length; i++){
            System.out.println(strA[i]+"$");
        }
        StringBuilder sb = new StringBuilder();
        for(int i = strA.length - 1; i >= 0; i--) {
            if(strA[i].trim().length() == 0){
                continue;
            }
            sb.append(strA[i].trim()).append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
