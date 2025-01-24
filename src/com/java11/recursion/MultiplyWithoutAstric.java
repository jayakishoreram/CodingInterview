package com.java11.recursion;

public class MultiplyWithoutAstric {

    public static void main(String[] args) {
        System.out.println(multiply(3, 10));
    }

    private static int multiply(int a, int b){
        if(a ==0 || b == 0){
            return 0;
        }
        if(b == 1){
            return a;
        }

        if(a > b){
            return a + multiply(a, b - 1);
        }else {
            return  b + multiply(a -1, b);
        }
    }
}
