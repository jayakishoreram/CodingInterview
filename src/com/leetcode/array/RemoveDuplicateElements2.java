package com.leetcode.array;

public class RemoveDuplicateElements2 {
    public static void main(String[] args) {
        int[] a = {1,2,2,2,3};
        int result = removeDuplicateElement2(a);
        System.out.println("Result: "+ result);
        for(int i=0; i < result; i++ ){
            System.out.print(a[i]);
        }
    }

    private static int removeDuplicateElement(int[] a){
        int index = 1;
        int count = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i - 1] == a[i]){
                count++;
            }else{
                count = 0;
            }
            if(count < 2){
                a[index++] = a[i];
            }
        }
        return index;
    }

    private static int removeDuplicateElement2(int[] a){
        int index = 0;
        int count = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i - 1] == a[i]){
                count++;
            }else{
                count = 0;
            }
            if(count >= 2){
                removeElement(a, i);
                index++;
                count--;
            }
        }
        return a.length - index + 1;
    }

    private static void removeElement(int[] a, int index){
        for(int i = index; i < a.length - 1; i++){
            a[i] = a[i + 1];
        }
    }
}
