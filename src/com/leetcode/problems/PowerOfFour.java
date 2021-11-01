package com.leetcode.problems;

public class PowerOfFour {
    static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        } else if (n % 4 !=0 || n == 0 || n == 2 || n == 3){
            return false;
        } else {
            return isPowerOfFour((int)n/4);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(3));
        System.out.println(isPowerOfFour(18));
    }
}
