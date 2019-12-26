package com.study.solution;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 * 例如：输入120  输出21
 *      输入123  输出321
 */
public class LeetCode007 {
    public int reverse(int x) {
        int target = 0;
        int initNum = x;
        int mod;
        while (initNum != 0) {
            mod = initNum % 10;
            initNum = initNum / 10;
            //内存溢出检测
            if(target > Integer.MAX_VALUE / 10 || (target == Integer.MAX_VALUE/10 && mod > 7)){
                return 0;
            }
            if(target < Integer.MIN_VALUE / 10 || (target == Integer.MIN_VALUE / 10 && mod < -8)){
                return 0;
            }
            target = target * 10 + mod;

        }
        return target;
    }
}
