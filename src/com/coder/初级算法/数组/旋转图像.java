package com.coder.初级算法.数组;

public class 旋转图像 {

    /**
    *
    * 给定一个 n × n 的二维矩阵表示一个图像。
    * 将图像顺时针旋转 90 度。
    *
    * 说明：
    * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
    *
    * 示例 1:
    * 给定 matrix =[
    *       [1,2,3],
    *       [4,5,6],
    *       [7,8,9]
    *      ],
    * 原地旋转输入矩阵，使其变为:
    * [
    *   [7,4,1],
    *   [8,5,2],
    *   [9,6,3]
    * ]
    *
    * 示例 2:
    * 给定 matrix =[
    *       [ 5, 1, 9,11],
    *       [ 2, 4, 8,10],
    *       [13, 3, 6, 7],
    *       [15,14,12,16]
    *     ],
    * 原地旋转输入矩阵，使其变为:
    * [
    *   [15,13, 2, 5],
    *   [14, 3, 4, 1],
    *   [12, 6, 8, 9],
    *   [16, 7,10,11]
    * ]
    *
    * */

    public void rotate(int[][] matrix) {
        int count = 1;
        int length = matrix.length;
        int sum = length * length;
        int max = sum / 4;
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length - (i + 1); j++) {
                if (count > max) {
                    flag = true;
                    break;
                }
                int num1 = matrix[i][j];
                int num2 = matrix[j][length - 1 - i];
                int num3 = matrix[length - 1 - i][length - 1 - j];
                int num4 = matrix[length - 1 - j][i];
                matrix[j][length - 1 - i] = num1;
                matrix[length - 1 - i][length - 1 - j] = num2;
                matrix[length - 1 - j][i] = num3;
                matrix[i][j] = num4;
                count++;
            }
            if (flag) {
                break;
            }
        }
    }

}
