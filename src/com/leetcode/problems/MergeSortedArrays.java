package com.leetcode.problems;

import java.util.Arrays;

public class MergeSortedArrays {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int insertIndex = m+n-1;
        int nums1Index = m-1,nums2Index = n-1;

        while(nums2Index>=0){
            if(nums1Index<0){
                nums1[insertIndex--] = nums2[nums2Index--];
            }else{
                if(nums2[nums2Index]>=nums1[nums1Index]){
                    nums1[insertIndex--] = nums2[nums2Index--];
                }else{
                    nums1[insertIndex--] = nums1[nums1Index--];
                }
            }
        }
        System.out.println(Arrays.toString(nums1));

    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
