package com.leetcode.problems;

import java.util.Arrays;

public class TwoSum_2 {
    static int[] sum(int[] numbers, int target){
        int[] result = new int[2];
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    result[0] = i+1;
                    result[1] = j+1;
                    return(result);
                }
            }
        }
        return(result);
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum(nums, target)));
    }
}
