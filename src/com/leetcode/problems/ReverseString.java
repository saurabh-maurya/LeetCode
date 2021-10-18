package com.leetcode.problems;

import java.util.Arrays;

public class ReverseString {
    static void reverseString(char[] s) {
        char temp;
        for(int i=0; i<(s.length/2); i++){
            temp = s[i];
            s[i] = s[s.length - i -1];
            s[s.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
