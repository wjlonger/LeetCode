package com.coder.初级算法.树;

import sun.reflect.generics.tree.Tree;

public class 将有序数组转换为二叉搜索树 {

    /**
     *
     * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
     *
     * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
     *
     * 示例:
     *
     * 给定有序数组: [-10,-3,0,5,9],
     *
     * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
     *
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     *
     */

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return getTree(nums,0,nums.length-1);
    }
    public TreeNode getTree(int[] nums, int left,int right){
        if(left <= right){
            int mid= (left + right) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = getTree(nums,left,mid - 1);
            node.right =getTree(nums,mid +1,right);
            return node;
        }
        return null;
    }

}
