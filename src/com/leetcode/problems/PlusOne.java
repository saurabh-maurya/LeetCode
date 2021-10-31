package com.leetcode.problems;

import java.util.Arrays;

public class PlusOne {
    static int[] plusOne(int[] digits) {
        if(digits.length==0){
            return digits;
        }
        int index = digits.length - 1;
        while(index>=0){
            if(digits[index] + 1 <= 9){
                digits[index] = digits[index] + 1;
                return digits;
            }
            digits[index] = 0;
            index--;
        }
        int[] newDigits = Arrays.copyOf(digits, digits.length+1);
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
