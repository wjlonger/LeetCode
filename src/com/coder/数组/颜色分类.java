package com.coder.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 颜色分类 {

    /**
     *
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     *
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     *
     * 注意:
     * 不能使用代码库中的排序函数来解决这道题。
     *
     * 示例:
     *
     * 输入: [2,0,2,1,1,0]
     * 输出: [0,0,1,1,2,2]
     * 进阶：
     *
     * 一个直观的解决方案是使用计数排序的两趟扫描算法。
     * 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
     * 你能想出一个仅使用常数空间的一趟扫描算法吗？
     */

    public static void sortColors(int[] nums) {
        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i : nums){
            switch (i){
                case 0:
                    list0.add(i);
                    break;
                case 1:
                    list1.add(i);
                    break;
                case 2:
                    list2.add(i);
                    break;
                default:
                    break;
            }
        }
        list0.addAll(list1);
        list0.addAll(list2);
        for(int i=0; i<list0.size(); i++){
            nums[i] = list0.get(i);
        }
        System.out.println(Arrays.toString(nums));
    }

    public void sortColors_god(int[] nums) {
        int red=0;
        int blue=nums.length-1;
        for(int i=0;i<=blue;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[red];
                nums[red]=temp;

                red++;
            }
            else if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[blue];
                nums[blue]=temp;
                //此处的i--是为了防止换过来的还是2而被忽略
                i--;
                blue--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0};
        sortColors(nums);
    }
}
