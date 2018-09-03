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
        if(root == null) return true;
        return isTreeSymmertic(root.left,root.right);
    }

    public static boolean isTreeSymmertic(TreeNode left,TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return isTreeSymmertic(left.left,right.right) && isTreeSymmertic(left.right,right.left);
    }
}
