package com.study.solution;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class LeetCode014 {
    public String longestCommonPrefix(String[] strs) {
        if(null == strs || strs.length == 0) {
            return "";
        }
        String tmp = strs[0];
        for (int i = tmp.length(); i >= 1; i --) {
            String t = tmp.substring(0, i);
            boolean isCommonPrefix = true;
            for (String s : strs) {
                if(!s.startsWith(t)) {
                    isCommonPrefix = false;
                    break;
                }
            }
            if(isCommonPrefix) {
                return tmp.substring(0, i);

            }
        }
        return "";
    }
}
