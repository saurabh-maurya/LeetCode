package com.leetcode.problems;

public class PowerOfThree {
    static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        } else if (n % 3 !=0 || n == 0 || n == 2){
            return false;
        } else {
            return isPowerOfThree((int)n/3);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
        System.out.println(isPowerOfThree(2));
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(28));
        System.out.println(isPowerOfThree(243));
    }
}
