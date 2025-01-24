package com.ascendion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestClass {

    private static Set<Integer> repo = new HashSet<>();

    public static void main(String[] args) {
        Integer[] mainArr = {1,2,3,2,1};
        Integer[] arr2 = {1,2,3};
        Integer[] arr3 = {1,2,3,4};

        Arrays.stream(mainArr).forEach(e -> repo.add(e));

        System.out.println(isSubSet(arr2));
        System.out.println(isSubSet(arr3));

    }

    private static boolean isSubSet(Integer[] input){
        for(int i = 0; i < input.length; i++){
            if(!repo.contains(input[i])){
                return false;
            }
        }
        return true;
    }

}
