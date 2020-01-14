package com.study.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LeetCode017 {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(null == digits || "".equals(digits)) {
            return result;
        }

        for (int i = 0; i < digits.length(); i ++) {
            String tmp = String.valueOf(digits.charAt(i));
            if("1".equals(tmp)) {
                continue;
            }

        }
        return result;
    }

    /**
     * 数字与字符的映射关系
     * @param num
     *      数字
     * @return String
     */
    private String getMappingStr (String num) {
        switch (num) {
            case "1" : return "";
            case "2" : return "abc";
            case "3" : return "def";
            case "4" : return "ghi";
            case "5" : return "jkl";
            case "6" : return "mno";
            case "7" : return "pqrs";
            case "8" : return "tuv";
            case "9" : return "wxyz";
            default:return "";
        }
    }
}
