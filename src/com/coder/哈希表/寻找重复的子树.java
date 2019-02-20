package com.coder.哈希表;

import com.coder.初级算法.树.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 寻找重复的子树 {

    /**
     *
     * 给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，
     * 你只需要返回其中任意一棵的根结点即可。
     *
     * 两棵树重复是指它们具有相同的结构以及相同的结点值。
     *
     * 示例 1：
     *
     *         1
     *        / \
     *       2   3
     *      /   / \
     *     4   2   4
     *        /
     *       4
     * 下面是两个重复的子树：
     *
     *       2
     *      /
     *     4
     * 和
     *
     *     4
     * 因此，你需要以列表的形式返回上述重复子树的根结点。
     */


    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        Map<Long, Integer> id =  new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, id, map, res);
        return res;
    }

    private Integer helper(TreeNode root, Map<Long, Integer> id, Map<Integer, Integer> map, List<TreeNode> res) {
        if (root == null) return 0;
        Long key = ((long) root.val << 32) | helper(root.left, id, map, res) << 16 | helper(root.right, id, map, res);
        if (!id.containsKey(key))
            id.put(key, id.size() + 1);
        int curId = id.get(key);
        if (map.containsKey(curId)) {
            if (map.get(curId) == 1) res.add(root);
            map.put(curId, map.get(curId) + 1);
        }
        else map.put(curId, 1);
        return curId;
    }


}
