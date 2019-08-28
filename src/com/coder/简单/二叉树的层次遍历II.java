package com.coder.简单;

import com.coder.初级算法.树.TreeNode;

import java.io.*;
import java.util.*;

public class 二叉树的层次遍历II {

    /**
     * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     *
     * 例如：
     * 给定二叉树 [3,9,20,null,null,15,7],
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回其自底向上的层次遍历为：
     *
     * [
     *   [15,7],
     *   [9,20],
     *   [3]
     * ]
     */

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        helper(root,0,res);
        Collections.reverse(res);
        return res;
    }

    public void helper(TreeNode root,int depth,List<List<Integer>>res){
        if(root==null)
            return;
        if(depth+1>res.size())
            res.add(new ArrayList());
        res.get(depth).add(root.val);
        if(root.left!=null)helper(root.left,depth+1,res);
        if(root.right!=null)helper(root.right,depth+1,res);
    }

}
