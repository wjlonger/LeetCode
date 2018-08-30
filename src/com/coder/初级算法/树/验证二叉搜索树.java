package com.coder.初级算法.树;

import java.util.ArrayList;
import java.util.List;

public class 验证二叉搜索树 {

    /**
     *
     * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
     *
     * 假设一个二叉搜索树具有如下特征：
     *
     * 节点的左子树只包含小于当前节点的数。
     * 节点的右子树只包含大于当前节点的数。
     * 所有左子树和右子树自身必须也是二叉搜索树。
     * 示例 1:
     *
     * 输入:
     *     2
     *    / \
     *   1   3
     * 输出: true
     * 示例 2:
     *
     * 输入:
     *     5
     *    / \
     *   1   4
     *      / \
     *     3   6
     * 输出: false
     * 解释: 输入为: [5,1,4,null,null,3,6]。
     *      根节点的值为 5 ，但是其右子节点值为 4 。
     *
     */

    // 我的垃圾小代码
//    public static boolean isValidBST(TreeNode root) {
//        boolean flag = true;
//        if(root == null){
//            flag = flag && true;
//        }else{
//            if(root.left == null && root.right == null){
//                flag = flag && true;
//            }else{
//                if(root.left != null){
//                    if(root.val <= root.left.val){
//                        flag = flag && false;
//                    }else{
//                        flag = flag && isValidBST(root.left);
//                    }
//                }
//                if(root.right != null){
//                    if(root.val >= root.right.val){
//                        flag = flag && false;
//                    }else{
//                        flag = flag && isValidBST(root.right);
//                    }
//                }
//            }
//        }
//        return flag;
//    }

    //网友的垃圾小代码

    //利用中序遍历的结果为有序序列
    public static boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        getSeq(root,list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static void getSeq(TreeNode root, List<Integer> list){
        if (root == null) {
            return;
        }
        getSeq(root.left,list);
        list.add(root.val);
        getSeq(root.right, list);
    }

    //大佬范例（中序遍历）
    private static TreeNode pre;
    public boolean isValidBST1(TreeNode root){
        if (root == null) {
            return true;
        }
        boolean l = isValidBST1(root.left);
        boolean c = pre == null || pre.val < root.val;
        pre = root;
        return l&&c&&isValidBST1(root.right);
    }

    //利用性质
    public boolean isValidBST2(TreeNode root) {
        if (root == null) return true;
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean valid(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (root.val <= low || root.val >= high) return false;
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }
}
