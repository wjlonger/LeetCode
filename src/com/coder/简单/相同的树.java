package com.coder.简单;

import com.coder.初级算法.树.TreeNode;
import org.omg.CORBA.INTERNAL;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

public class 相同的树 {

    /**
     *
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     *
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     *
     * 示例 1:
     *
     * 输入:       1         1
     *           / \       / \
     *          2   3     2   3
     *
     *         [1,2,3],   [1,2,3]
     *
     * 输出: true
     * 示例 2:
     *
     * 输入:      1          1
     *           /           \
     *          2             2
     *
     *         [1,2],     [1,null,2]
     *
     * 输出: false
     * 示例 3:
     *
     * 输入:       1         1
     *           / \       / \
     *          2   1     1   2
     *
     *         [1,2,1],   [1,1,2]
     *
     * 输出: false
     */

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> listP = inOrder(new ArrayList<>(),p);
        List<Integer> listQ = inOrder(new ArrayList<>(),q);
        if(listP.size() != listQ.size()){
            return false;
        }
        for(int i=0, j=listP.size(); i<j; i++){
            if(listP.get(i) != null
                    && listQ.get(i) != null
                    && !listP.get(i).equals(listQ.get(i))){
                return false;
            }
        }
        return true;
    }


    public List<Integer> inOrder(List<Integer> list,TreeNode treeNode){
        if(null != treeNode){
            inOrder(list,treeNode.left);
            list.add(treeNode.val);
            inOrder(list,treeNode.right);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(1);
        System.out.println(list.size());
    }
}
