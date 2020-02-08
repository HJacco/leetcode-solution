package com.study.solution;

/**
 *
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * */
public class LeetCode028 {
    public int strStr(String source, String target) {
        if(null == source || null == target) {
            return -1;
        }
        if("".equals(target) && "".equals(source)) {
            return 0;
        }
        if("".equals(source)) {
            return -1;
        }
        if("".equals(target)) {
            return 0;
        }
        char fitstChar = target.charAt(0);
        for (int i = 0; i <= source.length() - target.length(); i ++) {
            char t = source.charAt(i);
            if(t != fitstChar) {
                continue;
            }
            boolean ok = true;
            for (int j = 0, k = i; j < target.length(); j ++, k ++) {
                if(source.charAt(k) != target.charAt(j)){
                    ok = false;
                    break;
                }
            }
            if(ok) {
                return i;
            }
        }
        return -1;
    }
}
