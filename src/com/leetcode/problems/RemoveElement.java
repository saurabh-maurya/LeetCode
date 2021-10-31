package com.leetcode.problems;

public class RemoveElement {
    static int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int index = 0;
        for (int i=0; i<nums.length; i++){
            if(val != nums[i]){
                nums[index] = nums[i];
                index += 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 3, 4};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
