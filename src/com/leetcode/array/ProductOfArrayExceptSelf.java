package com.leetcode.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] result = product(array);
        int[] result2 = product2(array);
        int[] result3 = product3(array);
        displayArray(result);
        displayArray(result2);
        displayArray(result3);
    }

    //Using divide operator - As per problem statement "/" operator should not be used.
    private static int[] product(int[] a){
        int product = 1;
        for(int element: a){
            product *= element;
        }
        int[] answer = new int[a.length];
        for(int i = 0; i < a.length; i++){
            answer[i] = product / a[i];
        }
        return answer;
    }

    //Time Complexity O(n)
    //Space Complexity O(n)
    private static int[] product2(int[] a){
        int length = a.length;
        int[] leftArray = new int[length];
        int[] rightArray = new int[length];
        int[] productArray = new int[length];
        leftArray[0] = 1;
        for(int i = 1; i < a.length; i++){
            leftArray[i] = leftArray[i - 1] * a[i - 1];
        }
        displayArray(leftArray);
        rightArray[length - 1] = 1;
        for(int i = length - 2; i >= 0; i--){
            rightArray[i] = rightArray[i + 1] * a[i + 1];
        }
        //displayArray(rightArray);

        for(int i = 0; i < length; i++){
            productArray[i] = leftArray[i] * rightArray[i];
        }
        //displayArray(productArray);
        return productArray;
    }

    //Time Complexity O(n)
    //Space Complexity O(1)
    private static int[] product3(int[] a){
        int length = a.length;
        int[] productArray = new int[length];
        productArray[0] = 1;
        for(int i = 1; i < a.length; i++){
            productArray[i] = productArray[i - 1] * a[i - 1];
        }
        //displayArray(productArray);
        int rightProduct = 1;
        for(int i = length - 1; i >= 0; i--){
            productArray[i] = rightProduct * productArray[i];
            rightProduct = rightProduct * a[i];
        }
        //displayArray(productArray);
        return productArray;
    }


    private static void displayArray(int[] a){
        Arrays.stream(a).forEach(System.out::print);
        System.out.println();
    }
}
