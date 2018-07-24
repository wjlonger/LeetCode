package com.coder.初级算法.字符串;

public class 验证回文字符串 {


    /**
    *
    * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
    * 说明：本题中，我们将空字符串定义为有效的回文串。
    *
    * 示例 1:
    * 输入: "A man, a plan, a canal: Panama"
    * 输出: true
    *
    * 示例 2:
    * 输入: "race a car"
    * 输出: false
    *
    *
    * */

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        char[] cs = s.toLowerCase().toCharArray();
        int i = 0;
        int j = cs.length - 1;
        while (i++ < j--){
            if(cs[i] == cs[j]){
                continue;
            }

            boolean f1 = (cs[i] >= 'a' && cs[i]<='z')||(cs[i]>='0'&&cs[i]<='9');
            boolean f2 = (cs[j] >= 'a' && cs[j]<='z')||(cs[j]>='0'&&cs[j]<='9');
            if(f1&&f2) return false;
        }
        return true;

    }

}
