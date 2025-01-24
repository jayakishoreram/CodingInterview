package com.java11;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class TestFlatMap {
    public static void main(String[] args) {

        List<String> pplNames = Arrays.asList("Giri", "Suman", "Giri");
        List<String> aniNames = Arrays.asList("Lucy", "Puppy", "Tommey");
        List<List<String>> namesList = Arrays.asList(pplNames, aniNames);

        List<String> allNames = namesList.stream().flatMap(List::stream).collect(Collectors.toList());
        allNames.forEach(System.out::println);
        System.out.println("_________________________________________");
        Set<String> pplNamesSet = new HashSet<>(pplNames);
        Set<String> aniNamesSet = new HashSet<>(aniNames);
        Set<Set<String>> namesSet = new HashSet<>(Arrays.asList(pplNamesSet, aniNamesSet));
        Set<String> allNamesSet =  namesSet.stream().flatMap(Set::stream).collect(Collectors.toSet());
        allNamesSet.forEach(System.out::println);

        System.out.println("_________________________________________");
        List<Set<String>> namesListonSet = new ArrayList<>(Arrays.asList(pplNamesSet, aniNamesSet));
        List<String> allNamesList =  namesListonSet.stream().flatMap(Set::stream).collect(Collectors.toList());
        allNamesList.forEach(System.out::println);

        System.out.println("__________________MAP DUDE_______________________");
        List<String> pplNames2 = Arrays.asList("Giri", "Suman", "Hari");
        List<String> aniNames2 = Arrays.asList("Lucy", "Puppy", "Tommey");
        Map<Integer, List<String>> pplNamesMap = pplNames2.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer, List<String>> aniNamesMap = aniNames2.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer, List<String>> mergeMap =  Stream.of(pplNamesMap, aniNamesMap)
                        .flatMap(map -> map.entrySet().stream())
                                .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (list1, list2) -> {
                                            List<String> valueList = new ArrayList<>();
                                            valueList.addAll(list1);
                                            valueList.addAll(list2);
                                            return valueList;
                                        } )
                                );
        mergeMap.entrySet().stream().forEach(System.out::println);
        System.out.println("__________________MAP DUDE_______________________");
        Stream.concat(pplNamesMap.entrySet().stream(), aniNamesMap.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (list1, list2) -> {
                            List<String> valueList = new ArrayList<>();
                            valueList.addAll(list1);
                            valueList.addAll(list2);
                            return valueList;
                        } )
                ).entrySet().forEach(System.out::println);

    }
}
