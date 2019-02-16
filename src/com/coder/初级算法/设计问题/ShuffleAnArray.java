package com.coder.初级算法.设计问题;

import java.util.Arrays;
import java.util.Random;

public class ShuffleAnArray {

    /**
     *
     * 打乱一个没有重复元素的数组。
     *
     * 示例:
     *
     * // 以数字集合 1, 2 和 3 初始化数组。
     * int[] nums = {1,2,3};
     * Solution solution = new Solution(nums);
     *
     * // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
     * solution.shuffle();
     *
     * // 重设数组到它的初始状态[1,2,3]。
     * solution.reset();
     *
     * // 随机返回数组[1,2,3]打乱后的结果。
     * solution.shuffle();
     *
     */

    public int[] original;
    public int[] current;

    public ShuffleAnArray(int[] nums) {
        original = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
     }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int len = original.length;
        current = Arrays.copyOf(original,len);
        int temp,j;
        Random r = new Random();
        for(int i=len-1; i>=0; i--){
            j = r.nextInt(i+1);
            temp = current[j];
            current[j] = current[i];
            current[i] = temp;
        }
        return current;
    }

}
