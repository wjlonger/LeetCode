package com.coder.初级算法.链表;

public class 两数相加 {

    /**
     *
     * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
     *
     * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     */
    public static void main(String[] args) {
        ListNode p1 = new ListNode(9);
        ListNode p2 = new ListNode(9);
//        ListNode p3 = new ListNode(3);
        p1.next = p2;
//        p2.next = p3;

        ListNode q1 = new ListNode(1);
//        ListNode q2 = new ListNode(5);
//        ListNode q3 = new ListNode(6);
//        q1.next = q2;
//        q2.next = q3;

        ListNode listNode = addTwoNumbers(p1,q1);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        int digit = 0;
        while (!(l1 == null && l2 == null)){
            if(l1 == null){
                int sum = digit + l2.val;
                int mod = sum % 10;
                if(head == null){
                    head = new ListNode(mod);
                    temp = head;
                }else{
                    temp.next = new ListNode(mod);
                    temp = temp.next;
                }
                digit = (sum >= 10) ? 1 : 0;
                l2 = l2.next;
            }
            else if(l2 == null){
                int sum = digit + l1.val;
                int mod = sum % 10;
                if(head == null){
                    head = new ListNode(mod);
                    temp = head;
                }else{
                    temp.next = new ListNode(mod);
                    temp = temp.next;
                }
                digit = (sum>=10) ? 1 : 0;
                l1 = l1.next;
            } else{
                int sum = digit + l1.val + l2.val;
                int mod = sum % 10;
                if(head == null){
                    head = new ListNode(mod);
                    temp = head;
                }else{
                    temp.next = new ListNode(mod);
                    temp = temp.next;
                }
                digit = (sum>=10) ? 1 : 0;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if(digit > 0){
            temp.next = new ListNode(1);
        }
        return head;
    }
}
