package com.string;

public class StringCombo1 {
    public static void main(String[] args) {
        System.out.println(partitionString("AAC"));
    }

    private static int partitionString(String s) {

        StringBuilder lookup = new StringBuilder();
        int ans = 0;
        for(int i = 0;i < s.length();i++)
        {
            char c = s.charAt(i);
            if(lookup.indexOf(c+"") != -1)
            {
                ans++;
                lookup.setLength(0);

            }

            lookup.append(c);
        }
        System.out.println(lookup);
        if(lookup.length() == s.length())
            return 1;


        if(lookup.length() != 0)
            ans += 1;
        return ans ;
    }
}
