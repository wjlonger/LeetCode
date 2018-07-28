package com.coder.初级算法.字符串;

public class 有效的字母异位词 {

    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        s = s.toLowerCase();
        t = t.toLowerCase();
        for(char c = 'a'; c<='z'; c++){
            s = s.replaceAll(c + "","");
            t = t.replaceAll(c + "","");
            if(s.length() != t.length()) return false;
        }
        return true;
    }
}
