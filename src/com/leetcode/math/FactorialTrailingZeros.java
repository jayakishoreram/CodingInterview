package com.leetcode.math;

import java.math.BigInteger;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        //System.out.println(trailingZeros(factorial(30)));
        System.out.println(TZ(30));
    }

    private static int TZ(int n){
        BigInteger nFactorial = BigInteger.ONE;
        for(int i = 1; i <= n; i++){
            nFactorial = nFactorial.multiply(BigInteger.valueOf(i));
        }
        int count = 0;
        while (nFactorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)){
            nFactorial = nFactorial.divide(BigInteger.TEN);
            count++;
        }
        return count;
    }

    private static long factorial(long n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static Integer trailingZeros(long n){
        System.out.println(n);
        int count = 0;
        while (n > 0){
            if(n % 10 == 0){
                count++;
            }else{
                return count;
            }
            n/= 10;
        }
        return count;
    }
}
