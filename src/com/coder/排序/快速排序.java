package com.coder.排序;

public class 快速排序 {

    /**
     *
     * 获取第 i 个没排序的元素，这个元素是以后元素中最小的元素
     *
     */
    public static void main(String[] args) {
        int[] is = {232131,23523,32,346,234,78,435875,534,834,7344,7};
        quickSort(is);
        for (int i : is){
            System.out.println(i);
        }
    }

    public static int[] quickSort(int[] is){
        for(int i=0,length=is.length; i<length; i++){
            int min = is[i];
            for(int j=i+1; j<length; j++){
                if(is[j]<min){
                    is[i] = is[j];
                    is[j] = min;
                    min = is[i];
                }
            }
        }
        return is;
    }
}
