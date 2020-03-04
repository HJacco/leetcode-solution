package com.study.dynamic.program;

/**
 * 硬币  2  5  7  用最少的硬币数拼出27
 */
public class CoinChange {
    public int coinChange (int[] A, int M) {
        int n = A.length;
        //表示拼出下标i的最少硬币数为f[i]
        int[] f = new int[M + 1];
        f[0] = 0;

        for (int i = 1; i < f.length; ++i) {
            f[i] = Integer.MAX_VALUE;
            for(int k = 0; k < n; k ++) {
                if(i >= A[k] && f[i - A[k]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i], f[i - A[k]] + 1);
                }
            }
            System.out.println("f[" + i + "]=" + f[i]);
        }
        if(f[M] == Integer.MAX_VALUE) {
            return -1;
        }
        return f[M];
    }

    public static void main(String[] args) {
        System.out.println(new CoinChange().coinChange(new int[]{2, 5, 7}, 27));
    }
}
