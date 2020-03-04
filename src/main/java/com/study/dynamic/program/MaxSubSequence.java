package com.study.dynamic.program;

/**
 *给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * */
public class MaxSubSequence {

    public static void main(String[] args) {
        System.out.println(new MaxSubSequence().maxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSum(int[] a) {
        if(a == null || a.length == 0) {
            return 0;
        }
        //f[i] 代表以a[i] 为结尾数字的最大子序列和
        int[] f = new int[a.length];
        f[0] = a[0];
        for (int i = 1; i < a.length; i ++) {
            if(f[i - 1] < 0) {
                f[i] = a[i];
            } else {
                f[i] = f[i - 1] + a[i];
            }
        }

        int max = 0;
        for (int i = 0; i < f.length; i ++) {
            max = Math.max(f[i], max);
        }
        return max;
    }
}
