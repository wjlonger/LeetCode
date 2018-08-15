package com.coder.初级算法.树;

public class 二叉树的最大深度 {

    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        if(root.left != null){
            int tempDepth = 1;
            maxDepth = Math.max(maxDepth,tempDepth);
        }
        return 0;
    }

}
