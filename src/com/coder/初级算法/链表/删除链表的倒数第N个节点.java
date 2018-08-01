package com.coder.初级算法.链表;

public class 删除链表的倒数第N个节点 {

    /**
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
     * <p>
     * 示例：
     * <p>
     * 给定一个链表: 1->2->3->4->5, 和 n = 2.
     * <p>
     * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
     * 说明：
     * <p>
     * 给定的 n 保证是有效的。
     * <p>
     * 进阶：
     * <p>
     * 你能尝试使用一趟扫描实现吗？
     */
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        ListNode node = removeNthFromEnd(node1,1);
        System.out.println(node);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 1;
        ListNode node = head;
        while ( node.next != null){
            node = node.next;
            i++;
        }
        int index = i - n;
        i = 0;
        node = head;
        do{
            if(i == index){
                if(i == 0){
                    if(head.next == null){
                        return null;
                    }
                    head.val = head.next.val;
                    head.next = head.next.next;
                    return head;
                }else{
                    node.val = node.next.val;
                    node.next = node.next.next;
                    return head;
                }
            }else{
                i++;
                node = node.next;
            }
        }while (node != null);
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
