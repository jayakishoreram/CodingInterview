package com.fedility;

import java.util.Stack;

public class TestJava {

    public static void main(String[] args) {
        System.out.println(isPolindrome("aabb"));
    }

    private static  Boolean isPolindrome(String s){
        StringBuilder b = new StringBuilder(s);
        String rev = b.reverse().toString();
        return b.equals(rev);
    }

    private static  Boolean isPolindromeChar(String s){

        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()){
            stack.push(c);
        }
        StringBuilder b =new StringBuilder();
        while(!stack.isEmpty()){
            b.append(stack.pop());
        }
        return false;
    }
}
