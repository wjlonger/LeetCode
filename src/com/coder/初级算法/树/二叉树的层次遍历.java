package com.coder.初级算法.树;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层次遍历 {
    /**
     *
     * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
     *
     * 例如:
     * 给定二叉树: [3,9,20,null,null,15,7],
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回其层次遍历结果：
     *
     * [
     *   [3],
     *   [9,20],
     *   [15,7]
     * ]
     *
     */

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> lists = new ArrayList<>();
        if(root != null){
            queue.offer(root);
        }
        while (!queue.isEmpty()){
            lists.add(offer(queue,new ArrayList<>()));
        }
        return lists;
    }

    public static List<Integer> offer(Queue<TreeNode> queue,List<Integer> list){
        List<TreeNode> treeNodes = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                list.add(node.val);
                treeNodes.add(node);
            }
        }
        for (TreeNode node : treeNodes){
            add(node,queue);
        }
        return list;

    }
    public static void add(TreeNode node,Queue<TreeNode> queue){
        if(node != null){
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
    }

}
