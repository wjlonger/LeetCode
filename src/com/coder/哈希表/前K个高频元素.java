package com.coder.哈希表;

import java.util.*;

public class 前K个高频元素 {

    /**
     *
     * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
     *
     * 示例 1:
     *
     * 输入: nums = [1,1,1,2,2,3], k = 2
     * 输出: [1,2]
     * 示例 2:
     *
     * 输入: nums = [1], k = 1
     * 输出: [1]
     * 说明：
     *
     * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
     * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
     */

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq =
                new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        for (Map.Entry<Integer,Integer> entry : set){
            pq.add(entry);
        }
        int i = 0;
        while (i++ < k){
            list.add(pq.poll().getKey());
        }
        return list;
    }
}
