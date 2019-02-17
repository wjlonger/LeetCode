package com.coder.数组类算法;

import java.util.Arrays;

public class 移动零 {

    /**
     *
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * 示例:
     *
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * 说明:
     *
     * 必须在原数组上操作，不能拷贝额外的数组。
     * 尽量减少操作次数。
     */

    public static void moveZeroes(int[] nums) {
        for(int s=0, e=nums.length-1; s<e; s++){
            int temp = nums[s];
            if(temp == 0){
                for(int i=s--; i<e; i++){
                    nums[i] = nums[i + 1];
                }
                nums[e--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,2,0,0,2,0,70,0,1,9,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
