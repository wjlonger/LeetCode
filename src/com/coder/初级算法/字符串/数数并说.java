package com.coder.初级算法.字符串;

public class 数数并说 {
    /**
     *
     * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
     *
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * 1 被读作  "one 1"  ("一个一") , 即 11。
     * 11 被读作 "two 1s" ("两个一"）, 即 21。
     * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
     *
     * 给定一个正整数 n ，输出报数序列的第 n 项。
     *
     * 注意：整数顺序将表示为一个字符串。
     *
     * 示例 1:
     *
     * 输入: 1
     * 输出: "1"
     * 示例 2:
     *
     * 输入: 4
     * 输出: "1211"
     *
     */

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        if (n < 1)
            return "";
        if (n == 1) {
            return "1";
        } else {
            String str = countAndSay(n - 1);
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < str.length(); ) {
                char first = str.charAt(i);
                int num = 0;
                while (i < str.length() && str.charAt(i) == first) {
                    num++;
                    i++;
                }
                //System.out.println("" + num + first);
                res.append(num).append(first);
            }
            return res.toString();
        }
    }
}
