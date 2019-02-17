package com.coder.初级算法.其他;

public class 汉明距离 {

    /**
     *
     * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
     *
     * 给出两个整数 x 和 y，计算它们之间的汉明距离。
     *
     * 注意：
     * 0 ≤ x, y < 231.
     *
     * 示例:
     *
     * 输入: x = 1, y = 4
     *
     * 输出: 2
     *
     * 解释:
     * 1   (0 0 0 1)
     * 4   (0 1 0 0)
     *        ↑   ↑
     *
     * 上面的箭头指出了对应二进制位不同的位置。
     */

    public static int hammingDistance(int x, int y) {
        int i = 0;
        int count = 0;
        while (i++ < 32){
            int tempX = x & 0b1;
            int tempY = y & 0b1;
            if(tempX != tempY){
                count++;
            }
            x = x >> 1;
            y = y >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}