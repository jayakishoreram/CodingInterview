package com.arrays;

public class TestClass {

    public static void main(String[] args) {
        String s = "qwerty";
        char[] carray = new char[s.length()];
        int i =0;
        for(char c : s.toCharArray()){
            carray[i++] = c;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = carray.length - 1; j>=0; j--){
            System.out.println(carray[j]);
            sb.append(carray[j]);
        }
        System.out.println(sb);

    }
}
