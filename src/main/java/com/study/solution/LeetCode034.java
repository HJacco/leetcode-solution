package com.study.solution;

import java.util.Arrays;

/**
 *给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 */
public class LeetCode034 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode034().searchRange(new int[]{5,7,7,8,8,10}, 10)));
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        if(target < nums[0] || target > nums[nums.length - 1]) {
            return new int[]{-1, -1};
        }
        int result = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if(nums[mid] == target) {
                result = mid;
                break;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(result == -1) {
            return new int[]{-1, -1};
        }
        left = right = result;
        while (left >= 0 ) {
            if(target != nums[left]) {
                break;
            } else {
                left --;
            }
        }
        while (right <= nums.length - 1 ) {
            if(target != nums[right]) {
                break;
            }else {
                right ++;
            }
        }
        return new int[]{left + 1, right - 1};
    }
}
