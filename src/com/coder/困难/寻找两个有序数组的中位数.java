package com.coder.困难;

public class 寻找两个有序数组的中位数 {

    /**
     *
     * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
     *
     * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     *
     * 你可以假设 nums1 和 nums2 不会同时为空。
     *
     * 示例 1:
     *
     * nums1 = [1, 3]
     * nums2 = [2]
     *
     * 则中位数是 2.0
     * 示例 2:
     *
     * nums1 = [1, 2]
     * nums2 = [3, 4]
     *
     * 则中位数是 (2 + 3)/2 = 2.5
     */

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i=nums1.length-1, j=nums2.length-1, k=0;
        while (i >= 0 || j >= 0){
            if(i < 0){
                nums[k++] = nums2[j--];
            }else if(j < 0){
                nums[k++] = nums1[i--];
            }else{
                int num1 = nums1[i], num2 = nums2[j];
                if(num1 > num2){
                    nums[k++] = num1;
                    i--;
                }else{
                    nums[k++] = num2;
                    j--;
                }
            }
        }
        if(nums.length == 0){
            return 0D;
        }
        return nums.length % 2 == 0 ?
                (nums[(nums.length / 2) - 1] + nums[nums.length / 2]) / 2D :
                nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
