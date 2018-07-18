package com.coder.初级算法.数组;

public class 移动零 {

    /*
    *
    * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    *
    * 示例:
    * 输入: [0,1,0,3,12]
    * 输出: [1,3,12,0,0]
    *
    * 说明:
    * 必须在原数组上操作，不能拷贝额外的数组。
    * 尽量减少操作次数。
    *
    * */

    public void moveZeroes(int[] nums) {
        for(int i=0; i< nums.length;){
            if(nums[i] == 0){
                int sum = 0;
                int j = i;
                for(;j<nums.length;j++){
                    sum += nums[j];
                }
                if(sum == 0) {
                    break;
                }
                j = i;
                for(int k=j+1;k<nums.length;j++,k++){
                    nums[j] = nums[k];
                }
                nums[nums.length-1] = 0;
            }else{
                i++;
            }
        }
    }

}
