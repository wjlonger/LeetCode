package com.coder.简单;

public class 二进制求和 {

    /**
     *
     * 给定两个二进制字符串，返回他们的和（用二进制表示）。
     *
     * 输入为非空字符串且只包含数字 1 和 0。
     *
     * 示例 1:
     *
     * 输入: a = "11", b = "1"
     * 输出: "100"
     * 示例 2:
     *
     * 输入: a = "1010", b = "1011"
     * 输出: "10101"
     */

    public static String addBinary(String a, String b) {
        char[] acs = a.toCharArray();
        char[] bcs = b.toCharArray();
        int acsi = acs.length - 1;
        int bcsi = bcs.length - 1;
        boolean jinwei = false;
        StringBuilder stringBuilder = new StringBuilder();
        while (acsi>=0 || bcsi>=0){
            int iacs = 0;
            int ibcs = 0;
            if(acsi >= 0){
                iacs = acs[acsi--] == '1' ? 1 : 0;
            }
            if(bcsi >= 0){
                ibcs = bcs[bcsi--] == '1' ? 1 : 0;
            }
            switch (iacs + ibcs){
                case 0:
                    if(jinwei){
                        stringBuilder.append(1);
                        jinwei = !jinwei;
                    }else{
                        stringBuilder.append(0);
                    }
                    break;
                case 1:
                    if(jinwei){
                        stringBuilder.append(0);
                    }else{
                        stringBuilder.append(1);
                    }
                    break;
                case 2:
                    if(jinwei){
                        stringBuilder.append(1);
                    }else{
                        stringBuilder.append(0);
                        jinwei = !jinwei;
                    }
                    break;
            }
        }
        if(jinwei){
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
}
