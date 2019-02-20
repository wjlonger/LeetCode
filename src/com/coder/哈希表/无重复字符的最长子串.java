package com.coder.哈希表;

import java.util.HashMap;
import java.util.Map;

public class 无重复字符的最长子串 {

    /**
     *
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     * 示例 1:
     *
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     *
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     *
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        char[] scs = s.toCharArray();
        for(int i=0; i<scs.length; i++){
            l1:{
                Map<Character, Integer> map = new HashMap<>();
                for(int j=i; j<scs.length; j++){
                    Integer integer = map.get(scs[j]);
                    if(null == integer){
                        integer = 1;
                    }else{
                        integer++;
                    }
                    map.put(scs[j], integer);
                    if(integer > 1){
                        length = Math.max(length, j - i);
                        break l1;
                    }
                }
                length = Math.max(length, scs.length - i);
            }

        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
