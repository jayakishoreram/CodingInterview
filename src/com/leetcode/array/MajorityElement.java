package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {1,2,2,2,1};
        System.out.println("Majority Element: "+ getMajorityElement2(array));
    }
    //Brute Force
    private static int getMajorityElement(int[] a){
        int size = a.length / 2;
        for(int i = 0; i < a.length; i++){
            int element = a[i];
            int count = 1;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] == element){
                    count++;
                    if(count > size){
                        return a[i];
                    }
                }
            }
        }
        return 0;
    }

    private static int getMajorityElement2(int[] a){
        int size = a.length / 2;
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int element: a) {
            if (countMap.containsKey(element)) {
                countMap.put(element, countMap.get(element) + 1);
            } else {
                countMap.put(element, 1);
            }
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > size) {
                    return entry.getKey();
                }
            }
        }
        return 0;
    }
}


