package com.coder.数组;

import java.util.Arrays;
import java.util.List;

public class 反转字符串中的元音字母 {

    /**
     *
     * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
     *
     * 示例 1:
     *
     * 输入: "hello"
     * 输出: "holle"
     * 示例 2:
     *
     * 输入: "leetcode"
     * 输出: "leotcede"
     * 说明:
     * 元音字母不包含字母"y"。
     */

    public static String reverseVowels(String s) {
        char[] scs = s.toCharArray();
        int i=0, j=scs.length-1;
        List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        while (i < j){
            if(list.contains(scs[i])){
                while (j > i){
                    if(list.contains(scs[j])){
                        char c = scs[i];
                        scs[i] = scs[j];
                        scs[j] = c;
                        j--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        return String.valueOf(scs);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
