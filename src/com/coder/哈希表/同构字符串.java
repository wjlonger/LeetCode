package com.coder.哈希表;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 同构字符串 {

    /**
     *
     * 给定两个字符串 s 和 t，判断它们是否是同构的。
     *
     * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
     *
     * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
     *
     * 示例 1:
     *
     * 输入: s = "egg", t = "add"
     * 输出: true
     * 示例 2:
     *
     * 输入: s = "foo", t = "bar"
     * 输出: false
     * 示例 3:
     *
     * 输入: s = "paper", t = "title"
     * 输出: true
     * 说明:
     * 你可以假设 s 和 t 具有相同的长度。
     */

    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> characterRelation = new HashMap<>();
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        for(int i=0; i<schars.length; i++){
            Character temp = characterRelation.get(schars[i]);
            if(null == temp){
                for(Map.Entry entry : characterRelation.entrySet()){
                    if(entry.getValue().equals(tchars[i])){
                        return false;
                    }
                }
                characterRelation.put(schars[i],tchars[i]);
            }else{
                if (!temp.equals(tchars[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab","aa"));
    }
}
