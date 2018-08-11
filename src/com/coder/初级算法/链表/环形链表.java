package com.coder.初级算法.链表;

public class 环形链表 {

    /**
     *
     * 给定一个链表，判断链表中是否有环。
     *
     * 进阶：
     * 你能否不使用额外空间解决此题？
     *
     */

    public static void main(String[] args) {
        ListNode p1 = new ListNode(3);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(0);
        ListNode p4 = new ListNode(-4);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        System.out.println(hasCycle(p1));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode temp = null;
        while (head != null){
            temp= head.next;
            while (temp != null){
                if(head.val == temp.val){
                    return true;
                }
                temp = temp.next;
            }
            head = head.next;
        }
        return false;

    }
}
