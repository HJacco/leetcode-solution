package com.study.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 */
public class LeetCode003 {
    /**
     * 滑动窗口法
     */
    public int lengthOfLongestSubstring(String s) {
        if(null == s || "".equals(s)) {
            return 0;
        }
        Set<Character> window = new HashSet<>(16);
        int result = 0, start = 0, end = 0;
        while (start < s.length() && end < s.length()) {
            if(!window.contains(s.charAt(end))) {
                window.add(s.charAt(end ++));
                result = Math.max(result, end - start);
            } else {
                window.remove(s.charAt(start ++));
            }
        }
        return result;
    }
}
