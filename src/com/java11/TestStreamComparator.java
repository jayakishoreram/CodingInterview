package com.java11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreamComparator {
    public static void main(String[] args) {

        method3();

    }

    private void method1(){
        List<Integer> intList = Stream.iterate(1, i -> i + 1)
                .limit(100)
                .sorted(Integer::compare)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    private static void method2(){
        Map<Boolean, List<Integer>> partitionEvenOdd = IntStream.rangeClosed(1, 25)
                .boxed()
                .collect(Collectors.partitioningBy((i) -> i % 2 == 0));
        System.out.println(partitionEvenOdd.get(true).size());
    }

    private static void method3(){
         /*List<Integer> listTill25 = IntStream.rangeClosed(1, 100)
                .boxed()
                .takeWhile(i -> i <= 25)
                .collect(Collectors.toList());
        System.out.println(listTill25.size());*/

        /*List<Integer> listAfter25 = IntStream.rangeClosed(1, 100)
                .boxed()
                .dropWhile(i -> i > 25)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(listAfter25.size());*/

        Stream<Integer> intStream
                = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

        // apply dropWhile to drop all the numbers
        // matches passed predicate
        List<Integer> listR
                = intStream.dropWhile(number -> (number / 4 == 1))
                .collect(Collectors.toList());

        // print listR
        System.out.println(listR);

        // create a intStream of names
        Stream<String> stream
                = Stream.of("aman", "amar", "suraj",
                "suvam", "Zahafuj");

        // apply dropWhile to drop all the names
        // matches passed predicate
        List<String> list
                = stream.dropWhile(name -> (name.charAt(0) == 'a'))
                .collect(Collectors.toList());

        // print listR
        System.out.println(list);
    }

/*    private static void method4(){
        List<String> stringList = Stream.of("A","AB","ABC","ABCD","ABCDE").collect(Collectors.toList());
        Map<Integer, List<String>> stringLengthMap = stringList.stream().collect(Collectors.groupingBy(String::length));
        Set l = stringLengthMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator::reverseOrder)).collect(Collectors.toSet());
        System.out.println(l);
    }*/
}
