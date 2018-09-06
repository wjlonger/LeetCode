package com.coder.初级算法.数学;

public class 计数质数 {

    /**
     *
     * 统计所有小于非负整数 n 的质数的数量。
     *
     * 示例:
     *
     * 输入: 10
     * 输出: 4
     * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
     *
     */

    public static void main(String[] args) {
        计数质数 计数质数 = new 计数质数();
        System.out.println(计数质数.countPrimes(10));
    }
    public int countPrimes(int n) {
        int count = 0;
        for(int i=1; i<n; i++){
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    System.out.println("i:" + i + " j:" + j);
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
