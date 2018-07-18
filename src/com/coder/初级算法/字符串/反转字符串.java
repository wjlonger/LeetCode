package com.coder.初级算法.字符串;

public class 反转字符串 {

    /*
    *
    * 请编写一个函数，其功能是将输入的字符串反转过来。
    * 示例：
    *
    * 输入：s = "hello"
    * 返回："olleh"
    *
    * */

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] cs = s.toCharArray();
        int i=cs.length;
        while (--i>=0){
            sb.append(cs[i]);
        }
        return sb.toString();
    }
}
