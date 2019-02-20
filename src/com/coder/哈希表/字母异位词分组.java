package com.coder.哈希表;

import java.util.*;

public class 字母异位词分组 {

    /**
     *
     * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
     *
     * 示例:
     *
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
     * 输出:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     * 说明：
     *
     * 所有输入均为小写字母。
     * 不考虑答案输出的顺序。
     */

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for(String s : strs){
            char[] chars = s.toCharArray();
            int[] charCount = new int[26];
            StringBuilder stringBuilder = new StringBuilder();
            for(char c : chars){
                charCount[c-'a'] += 1;
            }
            for(int i=0; i<charCount.length; i++){
                int temp = charCount[i];
                if(0 != temp){
                    stringBuilder.append((char)(i+'a')).append(temp);
                }
            }
            List<String> list = map.get(stringBuilder.toString());
            if(null == list){
                list = new ArrayList<>();
            }
            list.add(s);
            map.put(stringBuilder.toString(),list);
        }
        List<List<String>> list = new ArrayList<>();
        for(Map.Entry entry : map.entrySet()){
            list.add((List<String>) entry.getValue());
        }
        return list;
    }

}
