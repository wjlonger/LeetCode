package com.coder.简单;

import com.coder.初级算法.树.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层平均值 {

    /**
     * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
     *
     * 示例 1:
     *
     * 输入:
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 输出: [3, 14.5, 11]
     * 解释:
     * 第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
     * 注意：
     *
     * 节点值的范围在32位有符号整数范围内。
     *
     */

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        TreeNode treeNode;
        int count;
        while (!queue.isEmpty()){
            count = queue.size();
            double sum = 0;
            for(int i=0; i<count; i++){
                treeNode = queue.poll();
                sum += treeNode.val;
                if(null != treeNode.left){
                    queue.offer(treeNode.left);
                }
                if(null != treeNode.right){
                    queue.offer(treeNode.right);
                }
            }
            list.add(sum / count);
        }
        return list;
    }
}
