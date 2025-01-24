package com.java11;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Integer i = null;
        Optional o = Optional.ofNullable(i);
        if(o.isPresent())
            System.out.println(o.get());
    }
}
