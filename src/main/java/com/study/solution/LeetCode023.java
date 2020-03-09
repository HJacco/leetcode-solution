package com.study.solution;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 */
public class LeetCode023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(null == lists || lists.length == 0) {
            return null;
        }
        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i ++) {
            result = this.merge2Lists(result, lists[i]);
        }

        return result;
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode result = new ListNode(0);
        ListNode head = result;
        ListNode n1 = l1;
        ListNode n2 = l2;
        while (n1 != null & n2 != null) {
            int i = n1.val;
            int j = n2.val;
            if(i > j) {
                result.next = new ListNode(j);
                n2 = n2.next;
            } else {
                result.next = new ListNode(i);
                n1 = n1.next;
            }
            result = result.next;
        }
        if(n1 != null) {
            result.next = n1;
        }
        if(n2 != null) {
            result.next = n2;
        }
        return head.next;
    }
}
