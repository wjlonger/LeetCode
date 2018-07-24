package com.coder.初级算法.数组;

import java.util.HashSet;

public class 只出现一次的数字 {

    /**
    *
    * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    * 说明：
    * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
    *
    * 示例 1:
    * 输入: [2,2,1]
    * 输出: 1
    *
    * 示例 2:
    * 输入: [4,1,2,1,2]
    * 输出: 4
    *
    * */

    public int singleNumber(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            boolean isSingle = numSet.add(nums[i]);
            if(isSingle){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i] == nums[j]){
                        isSingle = false;
                        break;
                    }
                }
            }
            if(isSingle) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

}
