package com.coder.初级算法.链表;

public class 合并两个有序链表 {

    /**
     *
     * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     * 示例：
     *
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     *
     */

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        ListNode p6 = new ListNode(6);
        ListNode p7 = new ListNode(7);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;

        ListNode q1 = new ListNode(2);
        ListNode q2 = new ListNode(5);
        ListNode q3 = new ListNode(6);
        ListNode q4 = new ListNode(7);
        ListNode q5 = new ListNode(20);
        ListNode q6 = new ListNode(32);
        ListNode q7 = new ListNode(323);
        q1.next = q2;
        q2.next = q3;
        q3.next = q4;
        q4.next = q5;
        q5.next = q6;
        q6.next = q7;

        ListNode t =mergeTwoLists(p1,q1);
        while (t != null){
            System.out.println(t.val);
            t = t.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode p = null;
        while (!(l1 == null && l2 == null)){
            if(l1 == null){
                if(head == null){
                    head = new ListNode(l2.val);
                    p = head;
                }else{
                    p.next = new ListNode(l2.val);
                    p = p.next;
                }
                l2 = l2.next;
            }else if(l2 == null){
                if(head == null){
                    head = new ListNode(l1.val);
                    p = head;
                }else{
                    p.next = new ListNode(l1.val);
                    p = p.next;
                }
                l1 = l1.next;
            }else{
                if(l1.val <= l2.val){
                    if(head == null){
                        head = new ListNode(l1.val);
                        p = head;
                    }else{
                        p.next = new ListNode(l1.val);
                        p = p.next;
                    }
                    l1 = l1.next;
                }else{
                    if(head == null){
                        head = new ListNode(l2.val);
                        p = head;
                    }else{
                        p.next =  new ListNode(l2.val);
                        p = p.next;
                    }
                    l2 = l2.next;
                }
            }

        }
        return head;
    }
}
