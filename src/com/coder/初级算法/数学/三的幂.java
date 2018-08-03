package com.coder.初级算法.数学;

public class 三的幂 {

    /**
     *
     * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
     *
     * 示例 1:
     *
     * 输入: 27
     * 输出: true
     * 示例 2:
     *
     * 输入: 0
     * 输出: false
     * 示例 3:
     *
     * 输入: 9
     * 输出: true
     * 示例 4:
     *
     * 输入: 45
     * 输出: false
     *
     */

    public static void main(String[] args) {
        int n = 0;
        System.out.println(isPwoerOfThree_God(n));
    }

    public static boolean isPowerOfThree(int n) {
        int i = 1;
        if( i == n) return true;
        while ( i > 0 && i < n ){
            i *= 3;
            if( i == n) return true;
        }
        return false;
    }

    public static boolean isPwoerOfThree_God(int n ){
        if (n < 1) return false;
        int maxPower = (int) Math.pow(3,(int)(Math.log(0x7fffffff)/Math.log(3)));
        return maxPower % n == 0;
    }
}
