package com.leetcode.problems;
/*
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which returns whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API.
*/

public class FirstBadVersion {
    boolean isBadVersion(int badVersion){
        if(badVersion == 4){
            return true;
        }
        return false;
    }

    public int implement() {
        int n = 5;
        int left = 1;
        int right = n;
        while (right >= left){
            int mid = (right - left)/2 + left;
            if(isBadVersion(mid)){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return isBadVersion(left)?left:left+1;
    }
}
