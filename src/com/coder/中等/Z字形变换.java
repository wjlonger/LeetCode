package com.coder.中等;

public class Z字形变换 {

    /**
     *
     * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
     *
     * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
     *
     * L   C   I   R
     * E T O E S I I G
     * E   D   H   N
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
     *
     * 请你实现这个将字符串进行指定行数变换的函数：
     *
     * string convert(string s, int numRows);
     * 示例 1:
     *
     * 输入: s = "LEETCODEISHIRING", numRows = 3
     * 输出: "LCIRETOESIIGEDHN"
     * 示例 2:
     *
     * 输入: s = "LEETCODEISHIRING", numRows = 4
     * 输出: "LDREOEIIECIHNTSG"
     * 解释:
     *
     * L     D     R
     * E   O E   I I
     * E C   I H   N
     * T     S     G
     */

    public String convert(String s, int numRows) {
        char[] scs = s.toCharArray();
        Character[][] chars = new Character[numRows][scs.length];
        shu(scs,chars,numRows,0,0);
        StringBuilder stringBuilder = new StringBuilder();
        for(Character[] characters : chars){
            for(Character character : characters){
                if(character != null){
                    stringBuilder.append(character);
                }
            }
        }
        return stringBuilder.toString();
    }

    private void shu(char[] scs,Character[][] chars,int numRows,int scsIndex,int i){
        for(int j=0; j<numRows; j++){
            if(scsIndex >= scs.length){
                return;
            }
            chars[j][i] = scs[scsIndex++];
        }
        xie(scs,chars,numRows,scsIndex,i);
    }

    private void xie(char[] scs,Character[][] chars,int numRows,int scsIndex,int i){
        for(int j=numRows-1; j>1;j--){
            if(scsIndex == scs.length){
                return;
            }
            i++;
            chars[j-1][i] = scs[scsIndex++];
        }
        shu(scs, chars, numRows, scsIndex, ++i);
    }

    public static void main(String[] args) {
        Z字形变换 z字形变换 = new Z字形变换();
        System.out.println(z字形变换.convert("LEETCODEISHIRING",3));
    }
}
