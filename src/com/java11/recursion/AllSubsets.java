package com.java11.recursion;

public class AllSubsets {

    public static void main(String[] args) {
        System.out.println(subSetCount(2));
    }

    private static int subSetCount(int n){
        if(n == 0){
            return 1;
        }
        return subSetCount(n -1) * 2;
    }
}
