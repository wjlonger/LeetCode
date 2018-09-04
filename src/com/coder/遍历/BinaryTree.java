package com.coder.遍历;

import com.coder.初级算法.树.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * 根结点D、左子树L、右子树R
 * D=Degree
 * L=Left
 * R=Right
 * 结点拥有的子树数称为结点的度（Degree）
 * 根 (Root)
 * 子树 (Sub Tree)
 *
 * 前序遍历 记为根左右 DLR
 * 中序遍历 记为左根右 LDR
 * 后序遍历 记为左右根 LRD
 *
 *
 *
 * 今天看了一些关于平和查找二叉树的问题，顺便也复习了一下二叉树的遍历规则，写一下学习文档。
 *
 * 树的遍历顺序大体分为三种：前序遍历（先根遍历、先序遍历），中序遍历（中根遍历），后序遍历（后根遍历）。
 *
 *
 *
 * 如图所示二叉树：
 *        A
 *      /   \
 *     B     C
 *   / \    /
 *  D   E  F
 *
 *
 * 前序遍历：前序遍历可以记为根左右，若二叉树为空，则结束返回。
 *
 *
 *
 * 前序遍历的规则：
 *
 * （1）访问根节点
 *
 * （2）前序遍历左子树
 *
 * （3）前序遍历右子树
 *
 *
 *
 * 这里需要注意：在完成第2,3步的时候，也是要按照前序遍历二叉树的规则完成。
 *
 * 前序遍历的输出结果：ABDECF
 *
 *
 *
 * 中序遍历：中序遍历可以记为左根右，也就是说在二叉树的遍历过程中，首先要遍历二叉树的左子树，接着遍历根节点，最后遍历右子树。
 *
 * 同样，在二叉树为空的时候，结束返回。
 *
 *
 *
 * 中序遍历的规则：
 *
 * （1）中序遍历左子树
 *
 * （2）访问根节点
 *
 * （3）中序遍历右子树
 *
 *
 *
 * 注意：在完成第1，3步的时候，要按照中序遍历的规则来完成。
 *
 * 中序遍历的输出结果：DBEAFC
 *
 *
 *
 * 后序遍历：后序遍历可以记为左右根，也就是说在二叉树的遍历过程中，首先按照后序遍历的规则遍历左子树，接着按照后序遍历的规则遍历右子树，最后访问根节点。
 *
 * 在二叉树为空的时候，结束返回。
 *
 * 后序遍历二叉树的规则：
 *
 * （1）后序遍历左子树
 *
 * （2）后序遍历右子树
 *
 * （3）访问根节点
 *
 * 注意：在完成1,2步的时候，依然要按照后序遍历的规则来完成。
 *
 * 后序遍历的输出顺序：DEBFCA
 */
public class BinaryTree {

    /**
     * 前序遍历，递归实现
     * 根左右
     * @param node
     */
    public void PreOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.val);
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }

    /**
     * 前序遍历，非递归实现
     * 根左右
     * 1，先入栈根节点，输出根节点val值，再先后入栈其右节点、左结点；
     * 2，出栈左节点，输出其val值，再入栈该左节点的右节点、左节点；直到遍历完该左节点所在子树。
     * 3，再出栈右节点，输出其val值，再入栈该右节点的右节点、左节点；直到遍历完该右节点所在子树。
     * @param root
     */
    public void PreOrder1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val);
            //右结点先入栈，左结点后入栈
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    /**
     * 中序遍历，递归实现
     * 左根右
     * @param node
     */
    public void InOrder(TreeNode node) {
        if (node != null) {
            InOrder(node.left);
            System.out.print(node.val);
            InOrder(node.right);
        }
    }

    /**
     * 中序遍历，非递归实现
     * 1，首先从根节点出发一路向左，入栈所有的左节点；
     * 2，出栈一个节点，输出该节点val值，查询该节点是否存在右节点，
     *    若存在则从该右节点出发一路向左入栈该右节点所在子树所有的左节点；
     * 3，若不存在右节点，则出栈下一个节点，输出节点val值，同步骤2操作；
     * 4，直到节点为null，且栈为空。
     * @param root
     */
    public void InOrder1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.empty()) {
                TreeNode node = stack.pop();
                System.out.print(node.val);
                root = node.right;
            }
        }
    }

    /**
     * 后序遍历，递归实现
     * 左右根
     * @param node
     */
    public void PostOrder(TreeNode node) {
        if (node != null) {
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.val);
        }
    }

    /**
     * 层序遍历（广度优先遍历）
     * @param root
     */
    public void LayerOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        //向队列中插入一个元素，并返回true
        //如果队列已满，返回false
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            //取出队列头部的元素，并从队列中移除
            //队列为空，返回null
            TreeNode node = queue.poll();
            System.out.print(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }
}