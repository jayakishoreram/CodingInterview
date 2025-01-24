package com.hcl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args){
        List<Integer> l1 = Arrays.asList(1,2,3,4);
        List<Integer> l2 = Arrays.asList(2,3,7,8);
        List<Integer> result = l1.stream().filter(ele -> !l2.contains(ele)).collect(Collectors.toList());
        if(null != l2) {
            List<Integer> result2 = l2.stream().filter(ele -> !l1.contains(ele)).collect(Collectors.toList());
            result.addAll(result2);
        }
        System.out.println(result);
    }


}
