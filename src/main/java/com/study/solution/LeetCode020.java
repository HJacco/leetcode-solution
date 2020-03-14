package com.study.solution;

import java.util.ArrayList;
import java.util.List;

/**
 *  给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 */
public class LeetCode020 {
    public boolean isValid(String s) {
        if("".equals(s) || null == s) {
            return true;
        }
        List<Integer> relation = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < s.length(); i ++) {
            Integer j = getMappingNumber(s.charAt(i));
            sum += j;
            if(j > 0) {
                relation.add(j);
            } else if (j == 0) {
                return false;
            } else {
                if(relation.size() == 0) {
                    return false;
                }
                int m = relation.remove(relation.size() - 1);
                if(m + j != 0) {
                    return false;
                }
            }
            
        }
        if(sum != 0) {
            return false;
        }
        return true;
    }


    private Integer getMappingNumber(Character c) {
        switch (c) {
            case '(' : return 1;
            case '{' : return 2;
            case '[' : return 3;
            case ')' : return -1;
            case '}' : return -2;
            case ']' : return -3;
            default : return 0;
        }
    }
}
