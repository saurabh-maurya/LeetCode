package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    static String reverse(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverse(s));
    }
}
