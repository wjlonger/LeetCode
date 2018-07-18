package com.coder.初级算法.数组;

import java.util.ArrayList;
import java.util.Collections;

public class 加一 {

    /*
    *
    * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
    * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
    * 你可以假设除了整数 0 之外，这个整数不会以零开头。
    *
    * 示例 1:
    * 输入: [1,2,3]
    * 输出: [1,2,4]
    * 解释: 输入数组表示数字 123。
    *
    * 示例 2:
    * 输入: [4,3,2,1]
    * 输出: [4,3,2,2]
    * 解释: 输入数组表示数字 4321。
    *
    * */

    public int[] plusOne(int[] digits) {
        ArrayList<Integer> digitList = new ArrayList<>();
        boolean jinwei = false;
        for(int i=digits.length-1;i>=0;i--){
            if(i == digits.length - 1){
                digits[i] = digits[i] + 1;
                jinwei = digits[i] >= 10;
                if(jinwei){
                    digits[i] = 0;
                    digitList.add(digits[i]);
                    if(i == 0) {
                        digitList.add(1);
                    }
                }else{
                    digitList.add(digits[i]);
                }
            }else{
                if(i == 0){
                    if(jinwei){
                        digits[i] = digits[i] + 1;
                        jinwei = digits[i] >= 10;
                        if(jinwei){
                            digits[i] = 0;
                            digitList.add(digits[i]);
                            digitList.add(1);
                        }else{
                            digitList.add(digits[i]);
                        }
                    }else{
                        digitList.add(digits[i]);
                    }
                }else{
                    if(jinwei){
                        digits[i] = digits[i] + 1;
                        jinwei = digits[i] >= 10;
                        if(jinwei){
                            digits[i] = 0;
                            digitList.add(digits[i]);
                        }else{
                            digitList.add(digits[i]);
                        }
                    }else{
                        digitList.add(digits[i]);
                    }
                }
            }
        }
        Collections.reverse(digitList);
        int[] nums = new int[digitList.size()];
        for(int i=0; i<digitList.size(); i++) {
            nums[i] = digitList.get(i);
        }
        return nums;
    }
}
