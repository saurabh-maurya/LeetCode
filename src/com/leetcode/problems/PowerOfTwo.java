package com.leetcode.problems;

public class PowerOfTwo {
    static boolean isPowerOfTwoMethod1(int n) {
        if (n == 1) {
            return true;
        } else if (n % 2 !=0 || n == 0){
            return false;
        } else {
            return isPowerOfTwoMethod1((int)n/2);
        }
    }
    static boolean isPowerOfTwoMethod2(int n) {
        if(n==0){
            return false;
        }
        int x = (int)(Math.log(n)/Math.log(2));
        if(Math.pow(2,x) == n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        System.out.println(isPowerOfTwoMethod1(1));
//        System.out.println(isPowerOfTwoMethod1(16));
//        System.out.println(isPowerOfTwoMethod1(5));
        System.out.println(isPowerOfTwoMethod2(1));
        System.out.println(isPowerOfTwoMethod2(16));
        System.out.println(isPowerOfTwoMethod2(5));

    }
}
