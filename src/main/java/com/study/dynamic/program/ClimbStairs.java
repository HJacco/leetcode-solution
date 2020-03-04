package com.study.dynamic.program;

/**
 * 爬楼梯
 * n阶楼梯，每次可以爬1阶或者2阶  总共多少种爬法
 */
public class ClimbStairs {
    public int climb(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        for (int i = 3; i < f.length; i ++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climb(3));
    }
}
