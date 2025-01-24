package com.arrays;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        for(int i = 0; i<10; i++){
            stringArray[i] = Integer.toString(i);
        }

        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
