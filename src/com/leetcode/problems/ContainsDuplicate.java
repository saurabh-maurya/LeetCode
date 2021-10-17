package com.leetcode.problems;
/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
*/

import java.util.HashSet;

public class ContainsDuplicate {
    static boolean containsDup(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for( int i=0; i<nums.length; i++){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1, 4, 5};
        System.out.println(containsDup(nums));
    }
}
