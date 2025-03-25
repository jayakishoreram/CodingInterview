package com.leetcode.array;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] a = {1,2,2,2,3};
        int result = removeDuplicateElement(a);
        System.out.println("Result: "+ result);
        for(int i=0; i < result; i++ ){
            System.out.print(a[i]);
        }
    }

    private static int removeDuplicateElement(int[] a){
        int index = 1;
        for(int i = 1; i < a.length; i++){
            if(a[i - 1] != a[i]){
                a[index] = a[i];
                index++;
            }
        }
        return index;
    }
}
