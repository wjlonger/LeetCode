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
        System.out.println(计数质数.countPrimes(499979));
    }
    public int countPrimes(int n) {
        boolean notPrime[] = new boolean[n + 2];
        notPrime[0] = notPrime[1] = true;
        for (int i = 2; i * i < n; i++) {
            if (!notPrime[i]) {
                int c = i * i;
                while (c < n) {
                    notPrime[c] = true;
                    c += i;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!notPrime[i])
                ans ++;
        }
        return ans;
    }
}
