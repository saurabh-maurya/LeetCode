package com.leetcode.problems;

public class RemoveDuplicatesFromSortedArray {
    static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int currentElement = nums[0];
        int index = 1;
        for (int i=1; i<nums.length; i++){
            if(currentElement != nums[i]){
                currentElement = nums[i];
                nums[index] = nums[i];
                index += 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 3, 4, 4, 5, 5};
        System.out.println(removeDuplicates(nums));
    }
}
