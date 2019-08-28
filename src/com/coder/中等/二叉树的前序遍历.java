package com.coder.中等;

import com.coder.初级算法.树.TreeNode;

import java.util.*;

public class 二叉树的前序遍历 {

    /**
     * 给定一个二叉树，返回它的 前序 遍历。
     *
     *  示例:
     *
     * 输入: [1,null,2,3]
     *    1
     *     \
     *      2
     *     /
     *    3
     *
     * 输出: [1,2,3]
     * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
     *
     */

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.empty()){
            TreeNode node = st.pop();
            list.add(node.val);
            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
//        treeNode3.left = treeNode2;
//        treeNode1.left = treeNode4;
//        treeNode1.right = treeNode3;

        treeNode3.left = treeNode2;
        treeNode4.left = treeNode3;
        treeNode1.left = treeNode4;
        二叉树的前序遍历 二叉树的前序遍历 = new 二叉树的前序遍历();
        System.out.println(Arrays.toString(二叉树的前序遍历.preorderTraversal(treeNode1).toArray(new Integer[]{})));
    }

}
