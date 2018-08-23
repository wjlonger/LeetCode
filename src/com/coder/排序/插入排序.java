package com.coder.排序;

/**
 * 从第二个元素开始，如果当前元素比前一个元素小，就再与前一个元素比较，直到找到比自己小的元素或者第一个元素，从这元素开始一次向后错一位，
 * 将自己这个元素按到找到的那个元素的位置
 */
public class 插入排序 {



    public static void main(String[] args) {
        int[] is = {232131,23523,32,346,234,78,435875,534,834,7344,7};
        straightInsertionSort(is);
        for(int i : is){
            System.out.println(i);
        }
    }
    // 32 23523 232131 346


    public static int[] straightInsertionSort(int[] is){
        for(int i=1,length=is.length; i<length; i++){
            int j = i-1;
            int temp = is[i];
            while (j >= 0){
                if(temp > is[j]){
                    j += 1;
                    break;
                }
                j--;
            }
            j = Math.max(j,0);
            for(int k=i; k>j; k--){
                is[k] = is[k-1];
            }
            is[j] = temp;
        }
        return is;
    }
}
