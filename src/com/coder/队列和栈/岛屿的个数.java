package com.coder.队列和栈;

public class 岛屿的个数 {

    /**
     *
     * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，
     * 计算岛屿的数量。一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。
     * 你可以假设网格的四个边均被水包围。
     *
     * 示例 1:
     *
     * 输入:
     * 11110
     * 11010
     * 11000
     * 00000
     *
     * 输出: 1
     * 示例 2:
     *
     * 输入:
     * 11000
     * 11000
     * 00100
     * 00011
     *
     * 输出: 3
     */

    //遍历数组，遇到1，则将其周围所有1都置0，循环操作
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == '1'){
                    res++;
                    toZero(grid,i,j,rows,cols);
                }
            }
        }
        return res;
    }
    private void toZero(char[][] grid,int i,int j,int rows,int cols){
        if(i<0 || i>=rows || j<0 || j>=cols){
            return ;
        }
        if(grid[i][j]!='1'){
            return;
        }
        grid[i][j]='0';
        toZero(grid,i+1,j,rows,cols);
        toZero(grid,i-1,j,rows,cols);
        toZero(grid,i,j+1,rows,cols);
        toZero(grid,i,j-1,rows,cols);
    }
}
