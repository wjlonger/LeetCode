package com.coder.简单;

public class 最后一个单词的长度 {

    /**
     *
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
     *
     * 如果不存在最后一个单词，请返回 0 。
     *
     * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
     *
     * 示例:
     *
     * 输入: "Hello World"
     * 输出: 5
     */

    public static int lengthOfLastWord(String s) {
        char[] cs = s.toCharArray();
        int count = 0;
        for(int i=cs.length-1; i>=0; i--){
            if(cs[i] == ' '){
                if(count > 0){
                    break;
                }else{
                    continue;
                }
            }else{
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
