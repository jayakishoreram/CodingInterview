package com.leetcode.array;

public class RemoveDupInSortedArray {

    public static void main(String[] args) {
        int[] intArray = new int[]{0,0,1,1,1,1,2,3,3};
        int length = removeDuplicates_2(intArray);
        Util.printArray(intArray, length);
    }

    private static int removeDuplicates_2(int[] a){
        int index = 2;
        int count = 0;
        for(int i = 2; i < a.length; i++){
            if(a[i - 1] == a[i]){
                count++;
            }else {
                count = 1;
            }
            if(count <= 2){
                a[index++] = a[i];
            }
        }
        return index;
    }

    private static int removeDuplicates_1(int[] a){
        int index = 1;
        for(int i = 1; i < a.length; i++){
            if(a[i - 1] != a[i]){
                a[index] = a[i];
                index++;
            }
        }
        return index;
    }
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        for(int i = 2; i < length; i++){
            if(nums[i-2] == nums[i - 1] && nums[i - 1] == nums[i]){
                removeElement(nums, i--);
                length--;
            }
        }
        return length;
    }

    private static int[] removeElement(int[] array, int position){
        for(int i = position; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        return array;
    }
}
