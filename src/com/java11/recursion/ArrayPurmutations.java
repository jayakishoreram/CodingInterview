package com.java11.recursion;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayPurmutations {

    public static void main(String[] args) {
        List<List<Integer>> output = permutationsWithDup(Arrays.asList(1,2,3,3));
        output.forEach(list -> {
            list.forEach(System.out::print);
            System.out.print("\n");
        });
    }

    private static List<List<Integer>> permutations(List<Integer> intList){
        if(intList.size() == 1){
            List<List<Integer>> result = new ArrayList<>();
            result.add(intList);
            return result;
        }
        Integer suffix = intList.get(0);
        List<Integer> subList = new ArrayList<>(intList.size() - 1);
        subList.addAll(intList.subList(1, intList.size()));
        List<List<Integer>> resultList = permutations(subList);
        List<List<Integer>> newResultList = new ArrayList<>();
        for(List<Integer> iteratorList : resultList){
            int size = iteratorList.size();
            for(int i = 0; i <= size; i++){
                List<Integer> integers = new ArrayList<>(iteratorList);
                integers.add(i, suffix);
                newResultList.add(integers);
            }
        }
        return newResultList;
    }

    private static List<List<Integer>> permutationsWithDup(List<Integer> intList){
        Map<Integer, Long> repMap = intList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        List<Integer> nonDupList = new ArrayList<>(new HashSet<>(intList));
        List<List<Integer>> output = permutations(nonDupList);
        List<List<Integer>> outputFinal = new ArrayList<>();
        for(List<Integer> innerList : output){
            List<Integer> integerList = new ArrayList<>(innerList);
            for(int i = 0; i< innerList.size(); i++){
                if(repMap.containsKey(innerList.get(i))){
                    long rep = repMap.get(innerList.get(i));
                    rep--;
                    for(int j = i; j < i + rep; j++){
                        integerList.add(j,innerList.get(i));
                    }
                }
            }
            outputFinal.add(integerList);
        }
        return outputFinal;
    }

}
