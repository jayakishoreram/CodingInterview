package com.leetcode.twopointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(array));
    }

    private static int containerWithMostWater(int[] array){
        int min = 0;
        int max = array.length - 1;
        int area = 0;
        while(min < max){
            int tmp = (max - min) * Math.min(array[min], array[max]);
            if(tmp > area) {
                area = tmp;
            }else if(array[min] <= array[max]){
                min++;
            }else {
                max--;
            }
        }
        return area;
    }
}
