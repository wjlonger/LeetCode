package com.coder.初级算法.字符串;

public class 最长公共前缀 {

    /**
     *
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     *
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     * 示例 1:
     *
     * 输入: ["flower","flow","flight"]
     * 输出: "fl"
     * 示例 2:
     *
     * 输入: ["dog","racecar","car"]
     * 输出: ""
     * 解释: 输入不存在公共前缀。
     * 说明:
     *
     * 所有输入只包含小写字母 a-z 。
     *
     */

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"babb","caa"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String s = strs[0];
        for(int i=1; i<strs.length; i++){
            s = strs[i].length() < s.length() ? strs[i] : s;
        }
        if(s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            boolean isEqual = true;
            for(String temp : strs){
                if(temp.charAt(i) != c){
                    isEqual = false;
                    break;
                }
            }
            if(isEqual){
                sb.append(c);
            }
            if(i == 0 && sb.length() == 0){
                return "";
            }
        }
        return sb.toString();
    }
}
