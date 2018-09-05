package com.coder.初级算法.动态规划;

public class 爬楼梯 {

    /**
     *
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * 注意：给定 n 是一个正整数。
     *
     * 示例 1：
     *
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     * 示例 2：
     *
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     *
     */

    public static void main(String[] args) {
        爬楼梯 爬楼梯 = new 爬楼梯();
        System.out.println(爬楼梯.climbStairs(100));
    }
    public int climbStairs(int n) {
        return lowerBench(0,n,0);
    }

    public int lowerBench(int now,int max,int step){
        for(int i=1; i<=2;i++){
            if(now + i < max){
                step = lowerBench(now+i,max,step);
            }else if(now + i > max){
                break;
            }else{
                step++;
            }
        }
        return step;
    }

    /**
     *
     * 大神的算法
     * 递归版本
     */

    public static int climbStairs_God_Recursion(int n) {
        int re = 0;
        if(n == 0 || n == 1){
            return 1;
        }else{
            re = climbStairs_God_Recursion(n-1)+climbStairs_God_Recursion(n-2);
        }
        return re;
    }

    /**
     *
     *
     *
     */
    public static int climbStairs_God(int n){
        int a = 1, b = 1, re = 0;
        if(n == 1 || n ==0){
            return 1;
        }
        while(--n > 0){
            re = a+b;
            b = a;
            a = re ;
        }
        return re;
    }
}
