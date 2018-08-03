package com.coder.初级算法.链表;

/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class 反转链表 {

    public static ListNode reverseList_ergodic (ListNode head) {
        ListNode prev = null;
        while(head!=null){
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;

    }

    public static ListNode reverseList_recursion (ListNode head) {
        if(head==null||head.next ==null)
            return head;
        ListNode prev = reverseList_recursion(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
