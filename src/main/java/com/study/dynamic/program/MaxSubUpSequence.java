package com.study.dynamic.program;

/**
 * 求最长上升子序列
 */
public class MaxSubUpSequence {

    public static void main(String[] args) {
        System.out.println(new MaxSubUpSequence().maxUpSeq(new int[]{10,9,8,5,3,7,101,18}));
    }

    public int maxUpSeq(int[] a) {
        if(a == null  || a.length == 0) {
            return 0;
        }

        //f[i] 代表以a[i]结尾最长上升子序列的长度
        int[] f = new int[a.length];
        f[0] = 1;
        for (int i = 1; i < f.length; i ++) {
            f[i] = 1;
            for(int j = 0; j < i; j ++) {
                if(a[i] >= a[j]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int i = 0; i < f.length; i ++) {
            maxLength = Math.max(maxLength, f[i]);
        }
        return maxLength;
    }
}
