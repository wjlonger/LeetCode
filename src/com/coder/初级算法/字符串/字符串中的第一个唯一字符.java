package com.coder.初级算法.字符串;

import java.util.HashSet;

public class 字符串中的第一个唯一字符 {

    /**
    *
    * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
    * 案例:
    * s = "leetcode"
    * 返回 0.
    *
    * s = "loveleetcode",
    * 返回 2.
    *
    * 注意事项：您可以假定该字符串只包含小写字母。
    *
    * */

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }

    public static int firstUniqChar(String s) {
        int index = -1;
        for(char c = 'a'; c <= 'z'; c++){
            if(s.indexOf(c) == -1) continue;
            if(s.indexOf(c) == s.lastIndexOf(c)){
                index = (index == -1) ? s.indexOf(c) : Math.min(s.indexOf(c),index);
            }
        }
        return index;
    }

}
