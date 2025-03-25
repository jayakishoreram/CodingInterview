package com.leetcode.recursion;

public class Recursions {
    //https://www.geeksforgeeks.org/types-of-recursions/?ref=shm
    public static void main(String[] args) {
        //tailRecursionArray(0, IntStream.of(1, 2, 3, 4, 5).toArray());
        //headRecursionArray(0, IntStream.of(1, 2, 3, 4, 5).toArray());
        treeRecursion(2);

    }

    private static void treeRecursion(int n){
        if(n < 0){
            return;
        }

        //System.out.println(n);
        //System.out.println("LEFT TREE IS START: " + n);
        treeRecursion(n-1);
        //System.out.println("LEFT TREE IS END: " + n);
        //System.out.println(n);
        //System.out.println("RIGHT TREE IS START: " + n);
        treeRecursion(n-1);
        //System.out.println("RIGHT TREE IS END: " + n);
        System.out.println(n);
    }

    private static int tailRecursion(int n){
        System.out.println(n);
        if(n == 1){
            return 0;
        }
        return tailRecursion(n - 1);
    }

    private static void tailRecursionArray(int index, int[] array){
        System.out.println(array[index]);
        if(index == array.length - 1){
            return;
        }
        tailRecursionArray(index + 1, array);
    }

    private static void headRecursion(int n){
        if(n > 0){
            headRecursion(n - 1);
        }
        System.out.println(n);
    }

    private static void headRecursionArray(int index, int[] array){

        if(index < array.length - 1){
            headRecursionArray(index + 1, array);
        }
        System.out.println(array[index]);
    }

}
