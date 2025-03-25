package com.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {

    }
    private static boolean isNumberHappy(int n){
        Set<Integer> visited = new HashSet<>();
       while (n != 1 && !visited.contains(n)){
           visited.add(n);
       }
        return n == 1;
    }

    //Optimistic
    private static boolean isNumberHappy2(int n){
        int slow = n;
        int fast = n;
        do{
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }while(slow != fast);
        return slow == 1;
    }

    private static int getNext(int n){
        int next = 0;
        while(n > 0){
            int rem = n % 10;
            next += rem * rem;
        }
        return next;
    }
}
