package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(zigzagConversion("PAYPALISHIRING", 1));
    }

    private static String zigzagConversion(String word,  int rows){
        if(0 == rows || rows > word.length() || rows == 1){
            return word;
        }

        List<StringBuilder> stringBuilderList = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            stringBuilderList.add(new StringBuilder());
        }

        int step = 1;
        int index = 0;
        for(char c: word.toCharArray()){
            stringBuilderList.get(index).append(c);
            System.out.println("Index: "+ index + " Char: "+ c);
            index += step;
            if(index == -1 || index == rows){
                step = -step;
                index += (step);
                index += (step);

            }
        }
        StringBuilder result = new StringBuilder();
        stringBuilderList.forEach(str -> result.append(str));
        return result.toString();
    }

}
