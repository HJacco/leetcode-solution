package com.study.solution;

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 */
public class LeetCode104 {

    public int maxDepth(TreeNode root) {
        if(null == root) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDept = maxDepth(root.right);
        return Math.max(leftDepth, rightDept) + 1;
    }
}
