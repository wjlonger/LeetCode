package com.coder.中等;

public class 最长回文子串 {

    /**
     *
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     *
     * 示例 1：
     *
     * 输入: "babad"
     * 输出: "bab"
     * 注意: "aba" 也是一个有效答案。
     * 示例 2：
     *
     * 输入: "cbbd"
     * 输出: "bb"
     */

    public static String longestPalindrome(String s) {
        char[] scs = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<scs.length; i++){
            for(int j=scs.length-1; j>=i; j--){
                if(scs[i] == scs[j]){
                    int tempi = i;
                    int tempj = j;
                    label1:{
                        while (++tempi<--tempj){
                            if(scs[tempi] != scs[tempj]){
                                break label1;
                            }
                        }
                        if((j - i + 1) > stringBuilder.toString().length()){
                            stringBuilder = new StringBuilder();
                            tempi = i;
                            tempj = j;
                            while (tempi <= tempj){
                                stringBuilder.append(scs[tempi++]);
                            }
                        }
                    }

                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }
}
