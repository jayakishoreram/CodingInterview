package com.java11;

import java.util.function.Predicate;

public class TestString {
    public static void main(String[] args) {
        String multiLineString = "This is \n multiline \n string";
        multiLineString.lines()
                .filter(phrase -> !"".equals(phrase))
                .forEach(System.out::println);
        multiLineString.lines()
                .filter(s -> s.isBlank()).forEach(System.out::println);
    }
}
