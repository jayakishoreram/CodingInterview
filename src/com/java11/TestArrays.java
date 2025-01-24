package com.java11;

import java.util.Arrays;
import java.util.List;

public class TestArrays {
    public static void main(String[] args) {
        List<String> stringArrayList = Arrays.asList("String1", "String2", "String3");
        String[] stringArray = stringArrayList.toArray(String[]::new);
        String[] stringArray2 = stringArrayList.stream().toArray(String[]::new);
        System.out.println(stringArray);
    }
}
