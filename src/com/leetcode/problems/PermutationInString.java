package com.leetcode.problems;

import java.util.Arrays;

public class PermutationInString {
    static String sortString(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    static boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            s1 = sortString(s1);
            if (s1.equals(sortString(s2.substring(i, i + s1.length())))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
