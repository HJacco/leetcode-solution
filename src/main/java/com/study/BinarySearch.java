package com.study;

public class BinarySearch {
    public int seartch(int[] ary, int target) {
        if(null == ary || ary.length == 0) {
            return -1;
        }
        int l = 0;
        int r = ary.length - 1;
        int mid = (l + r) / 2;
        while (l <= r) {
            if(ary[mid] == target) {
                return mid;
            }
            if(ary[mid] < target) {
                l = mid + 1;
            }
            if(ary[mid] > target) {
                r = mid - 1;
            }
            mid = (l + r) / 2;
        }
        return -1;
    }

    public int findMin(int[] ary) {
        if(null == ary || ary.length == 0) {
            return -1;
        }
        int l = 0, r = ary.length - 1;
        int mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            if(ary[mid] > ary[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return ary[r];
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6,9};
        System.out.println(new BinarySearch().seartch(a, 9));

        int[] b = {4,6,0,1,2,3};
        System.out.println(new BinarySearch().findMin(b));
    }
}
