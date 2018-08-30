package com.coder.初级算法.树;

import java.util.ArrayList;
import java.util.List;

public class 对称二叉树 {

    /**
     *
     * 给定一个二叉树，检查它是否是镜像对称的。
     *
     * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
     *
     *     1
     *    / \
     *   2   2
     *  / \ / \
     * 3  4 4  3
     * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
     *
     *     1
     *    / \
     *   2   2
     *    \   \
     *    3    3
     * 说明:
     *
     * 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
     *
     */

    public static void main(String[] args) {
        System.out.println(isSymmetric(null));
    }

    /**
     * 递归实现
     * @param root
     * @return
     */
    public static boolean isSymmetric(TreeNode root) {
        List<Integer> treeNodes = new ArrayList<Integer>();
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(3);
        TreeNode E = new TreeNode(2);
        A.left = B;
        A.right = C;
        B.left = D;
        C.left = E;
        inOrder(A,treeNodes);
        for(Integer t : treeNodes){
            System.out.println(t);
        }
        int i = 0;
        int j = treeNodes.size() - 1;
        while (i < j){
            if(treeNodes.get(i++) != treeNodes.get(j--)){
                return false;
            }
        }
        return true;
    }

    public static void inOrder(TreeNode node,List<Integer> list){
        if(node != null){
            inOrder(node.left,list);
            if(node != null){
                list.add(node.val);
            }else{
                list.add(null);
            }
            inOrder(node.right,list);
        }else{
            list.add(null);
        }
    }
}
