package com.study.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * <p>
 * 例如，给出 n = 3，生成结果为：
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */
public class LeetCode022 {

    public static void main(String[] args) {
        new LeetCode022().generateParenthesis(3);
    }

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        backtrack(result, "", 0, 0, 3);

        return result;
    }

    public void backtrack(List<String> result, String paras, int left, int right, int n) {
        if (paras.length() == 2 * n) {
            result.add(paras);
            return;
        }
        if (left < n) {
            backtrack(result, paras + "(", left + 1, right, n);
        }
        if (right < left) {
            backtrack(result, paras + ")", left, right + 1, n);
        }
    }
}
