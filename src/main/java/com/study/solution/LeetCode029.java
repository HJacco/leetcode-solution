package com.study.solution;

/**
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 示例 1:
 *
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 示例 2:
 *
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 *
 */
public class LeetCode029 {

    public static void main(String[] args) {
        System.out.println(new LeetCode029().divide(9, 3));
    }

    public int divide(int a, int b) {
        // a = -2^31, b = -1, a/b = 2^31
        if (a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE;
        // a = -2^31, b = -2^31, a/b = 1
        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) return 1;
        // a != -2^31, b = -2^31, a/b = 0
        if (b == Integer.MIN_VALUE) return 0;
        // a = -2^31, b != -2^31:  a <= a + abs(b), fix = b > 0 ? -1 : 1
        int fix = 0;
        if (a == Integer.MIN_VALUE) {
            if (b > 0) {
                a += b;
                fix = -1;
            } else {
                a -= b;
                fix = 1;
            }
        }
        boolean neg = false;
        if (a < 0) {
            a = -a;
            neg = !neg;
        }
        if (b < 0) {
            b = -b;
            neg = !neg;
        }
        int result = 0;
        while (a >= b) {
            int x = b;
            int r = 1;
            while (x <= (a>>1)) {
                x <<= 1;
                r <<= 1;
            }
            a -= x;
            result += r;
        }
        return (neg ? -result : result) + fix;

    }
}
