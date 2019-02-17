package com.coder.初级算法.其他;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 帕斯卡三角形 {

    /**
     *
     * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
     *
     *
     *
     * 在杨辉三角中，每个数是它左上方和右上方的数的和。
     *
     * 示例:
     *
     * 输入: 5
     * 输出:
     * [
     *      [1],
     *     [1,1],
     *    [1,2,1],
     *   [1,3,3,1],
     *  [1,4,6,4,1]
     * ]
     */

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i )
                    list.add(1);
                else
                    list.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = generate(5);
        for(List<Integer> list : lists){
            for(Integer i : list){
                System.out.print(i + "   ");
            }
            System.out.println();
        }
    }
}
