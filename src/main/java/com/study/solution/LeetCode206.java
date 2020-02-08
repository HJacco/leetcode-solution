package com.study.solution;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        if(null == head) {
            return null;
        }
        ListNode n1 = null;
        ListNode c1 = head;
        ListNode n2 = null;
        ListNode c2 = new ListNode(head.val);
        while (true) {
            n1 = c1.next;
            c1 = n1;
            if(n1 != null) {
                n2 = new ListNode(n1.val);
                n2.next = c2;
                c2 = n2;
            } else {
                break;
            }
        }
        return c2;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { this.val = x; }
    }
}
