package com.java11.recursion;

public class MagicIndex {
    private static int[] array = {-40, -20, -1, 1, 2, 3, 5, 7, 9, 12};

    public static void main(String[] args) {
        int magicIndex = magicIndex(array, 0, array.length);
        System.out.println("Magic Index: "+ magicIndex);
    }

    private static int magicIndex(int[] array, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if(mid == array[mid]){
            return mid;
        } else if (array[mid] > mid) {
            return magicIndex(array, start, mid - 1);
        }else{
            return magicIndex(array, mid + 1, end);
        }
    }
}
