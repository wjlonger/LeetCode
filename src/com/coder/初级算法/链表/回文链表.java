package com.coder.初级算法.链表;

import java.util.ArrayList;
import java.util.List;

public class 回文链表 {
    /**
     *
     * 请判断一个链表是否为回文链表。
     *
     * 示例 1:
     *
     * 输入: 1->2
     * 输出: false
     * 示例 2:
     *
     * 输入: 1->2->2->1
     * 输出: true
     * 进阶：
     * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
     *
     */

    public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while (head != null){
            nums.add(head.val);
            head = head.next;
        }
        for(int i=0, j=nums.size()-1;i<j;i++,j--){
            if(!nums.get(i).equals(nums.get(j))){
                return false;
            }
        }
        return true;
    }
}
