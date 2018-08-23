package com.coder.排序;

public class 冒泡排序 {

    /**
     *
     * 假设数组为 {9,8,7,6,5,4,3,2,1}
     * 此时为冒泡排序耗时最长的情况，如果想排序好，也就是最后一个元素1到第一个元素，则需移动 8（或length - 1）次
     *
     */

    public static void main(String[] args) {
        int[] is = {232131,23523,32,346,234,78,435875,534,834,7344,7};
        bubbleSort(is);
        for(int i : is){
            System.out.println(i);
        }

    }
    public static int[] bubbleSort(int[] is){
        for(int i=0,length=is.length-1; i<length; i++){
            for(int j=0; j<length; j++){
                if(is[j] > is[j+1]){
                    int temp = is[j];
                    is[j] = is[j+1];
                    is[j+1] = temp;
                }
            }
        }
        return is;
    }
}
