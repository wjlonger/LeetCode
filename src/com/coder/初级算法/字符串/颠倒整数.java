package com.coder.初级算法.字符串;

public class 颠倒整数 {
    /**
    *
    * 给定一个 32 位有符号整数，将整数中的数字进行反转。
    * 示例 1:
    * 输入: 123
    * 输出: 321
    *
    * 示例 2:
    * 输入: -123
    * 输出: -321
    *
    * 示例 3:
    * 输入: 120
    * 输出: 21
    *
    * 注意:
    * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。
    * 根据这个假设，如果反转后的整数溢出，则返回 0。
    *
    * */

    public static void main(String[] args) {
        int x = -1230999999;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() - 1;
        char[] cs = s.toCharArray();
        while (i < j){
            if(cs[i] == '-'){
                i++;
                continue;
            }else{
                char c = cs[j];
                cs[j] = cs[i];
                cs[i] = c;
                i++;
                j--;
            }
        }
        try {
            x = Integer.parseInt(String.valueOf(cs));
            return x;
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
