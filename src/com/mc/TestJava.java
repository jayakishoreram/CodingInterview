package com.mc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJava {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(System.out::print);
        System.out.println(" ");
        System.out.println("-----------------------");
        /*Stream.iterate(new int[]{0,1}, n ->  new int[]{n[1], n[0] + n[1]})
                .map(n -> n[0])
                .filter(n -> n < 100)
                //.limit(20)
                .forEach(System.out::println);*/

        System.out.println("-----------------------");

        Integer[][] strArray = new Integer[][]{{1,2},{3,4},{5,6}};

        List<Integer> integerList = Arrays.stream(strArray)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(integerList);


    }

}
