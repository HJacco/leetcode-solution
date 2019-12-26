package com.study.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 例如：给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class LeetCode001 {
    /**
     * 暴力解题
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
               if(nums[i] + nums[j] == target) {
                   return new int[]{i,j};
               }
            }
        }
        return null;
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<Integer, Integer>(16);
        for (int i = 0; i < nums.length; i ++) {
            index.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i ++) {
            int minus = target - nums[i];
            if (index.containsKey(minus) && index.get(minus) != i) {
                return new int[]{i, index.get(minus)};
            }
        }
        return null;
    }
}
