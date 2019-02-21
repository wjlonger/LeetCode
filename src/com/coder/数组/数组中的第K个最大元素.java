package com.coder.数组;

import java.util.PriorityQueue;

public class 数组中的第K个最大元素 {

    /**
     *
     * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     *
     * 示例 1:
     *
     * 输入: [3,2,1,5,6,4] 和 k = 2
     * 输出: 5
     * 示例 2:
     *
     * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
     * 输出: 4
     * 说明:
     *
     * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
     */

    public static int findKthLargest(int[] nums, int k) {
        if(null == nums || nums.length == 0 || k > nums.length || k < 1)
            return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int i=0;i<k;i++) {
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++) {
            if(nums[i] > pq.peek()) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));
    }
}
