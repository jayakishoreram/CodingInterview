package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringComb {

    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
    }
        public static int partitionString(String s) {
            int count = 0;
            String[] sc = new String[s.length()];
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                for(int j = 0; j < sc.length; j++){
                    if(sc[j] == null){
                        sc[j] = c + "";
                        count++;
                        break;
                    }else if(!sc[j].contains(c + "")){
                        sc[j] = sc[j].concat(c + "");
                        break;
                    }
                }
            }
            return count;
        }
    }

