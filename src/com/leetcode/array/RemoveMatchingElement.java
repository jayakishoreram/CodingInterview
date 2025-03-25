package com.leetcode.array;

public class RemoveMatchingElement {
    public static void main(String[] args) {
        int[] a = {1};
        int result = removeElement(a, 4);
        System.out.println("Result: "+ result);
        for(int i=0; i < result; i++ ){
            System.out.print(a[i]);
        }
    }

    private static int removeElement(int[] a, int e){
        int j = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != e){
                a[j] = a[i];
                j++;
            }
        }
        return j;
    }
}
