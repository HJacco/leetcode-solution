package com.study.solution;

/**
 * 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * ================
 * 输入: 121
 * 输出: true
 * ================
 * 输入: -121
 * 输出: false
 */
public class LeetCode009 {

    public static void main(String[] args) {
        System.out.println(new LeetCode009().isPalindrome(-121));
    }
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        if(x == 0) {
            return true;
        }
        String tmp = String.valueOf(x);
        int start = 0;
        int end = tmp.length() - 1;
        while (start <= end) {
            if(tmp.charAt(start) == tmp.charAt(end)) {
                start ++;
                end --;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 只要把前半部分的数字和后半部分的数字做对比就可以得出结论了
     */
    public boolean isPalindRome(int x) {
        if(x < 0 ||(x != 0 && x % 10 ==0)) {
            return false;
        }

        int reverseNum = 0;
        while (x > reverseNum) {
            reverseNum = reverseNum * 10 + x %10;
            x /= 10;
        }
        return x == reverseNum || x== reverseNum/10;
    }
}
