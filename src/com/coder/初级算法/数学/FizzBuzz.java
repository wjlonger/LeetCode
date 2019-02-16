package com.coder.初级算法.数学;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    /**
     *
     * 写一个程序，输出从 1 到 n 数字的字符串表示。
     *
     * 1. 如果 n 是3的倍数，输出“Fizz”；
     *
     * 2. 如果 n 是5的倍数，输出“Buzz”；
     *
     * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
     *
     * 示例：
     *
     * n = 15,
     *
     * 返回:
     * [
     *     "1",
     *     "2",
     *     "Fizz",
     *     "4",
     *     "Buzz",
     *     "Fizz",
     *     "7",
     *     "8",
     *     "Fizz",
     *     "Buzz",
     *     "11",
     *     "Fizz",
     *     "13",
     *     "14",
     *     "FizzBuzz"
     * ]
     */

    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>(n);
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                if(i % 15 == 0){
                    fizzBuzz.add("FizzBuzz");
                }else{
                    fizzBuzz.add("Fizz");
                }
            }else if(i % 5 == 0){
                fizzBuzz.add("Buzz");
            }else{
                fizzBuzz.add(String.valueOf(i));
            }
        }
        return fizzBuzz;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> fizzBuzzs = fizzBuzz.fizzBuzz(15);
        for(String fb: fizzBuzzs){
            System.out.println(fb);
        }
    }
}
