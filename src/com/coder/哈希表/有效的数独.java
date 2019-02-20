package com.coder.哈希表;

public class 有效的数独 {

    /**
     *
     * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
     *
     * 数字 1-9 在每一行只能出现一次。
     * 数字 1-9 在每一列只能出现一次。
     * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
     *
     *
     * 上图是一个部分填充的有效的数独。
     *
     * 数独部分空格内已填入了数字，空白格用 '.' 表示。
     *
     * 示例 1:
     *
     * 输入:
     * [
     *   ["5","3",".",".","7",".",".",".","."],
     *   ["6",".",".","1","9","5",".",".","."],
     *   [".","9","8",".",".",".",".","6","."],
     *   ["8",".",".",".","6",".",".",".","3"],
     *   ["4",".",".","8",".","3",".",".","1"],
     *   ["7",".",".",".","2",".",".",".","6"],
     *   [".","6",".",".",".",".","2","8","."],
     *   [".",".",".","4","1","9",".",".","5"],
     *   [".",".",".",".","8",".",".","7","9"]
     * ]
     * 输出: true
     * 示例 2:
     *
     * 输入:
     * [
     *   ["8","3",".",".","7",".",".",".","."],
     *   ["6",".",".","1","9","5",".",".","."],
     *   [".","9","8",".",".",".",".","6","."],
     *   ["8",".",".",".","6",".",".",".","3"],
     *   ["4",".",".","8",".","3",".",".","1"],
     *   ["7",".",".",".","2",".",".",".","6"],
     *   [".","6",".",".",".",".","2","8","."],
     *   [".",".",".","4","1","9",".",".","5"],
     *   [".",".",".",".","8",".",".","7","9"]
     * ]
     * 输出: false
     * 解释: 除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。
     *      但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
     * 说明:
     *
     * 一个有效的数独（部分已被填充）不一定是可解的。
     * 只需要根据以上规则，验证已经填入的数字是否有效即可。
     * 给定数独序列只包含数字 1-9 和字符 '.' 。
     * 给定数独永远是 9x9 形式的。
     */

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char character = board[i][j];
                if(character == '.'){
                    continue;
                }
                if(character < '0' || character > '9' || '.' != character){
                    return false;
                }
                for (int k = 0; k < board[i].length; k++) {
                    if (k == j) {
                        continue;
                    }
                    if (board[i][k] == character) {
                        return false;
                    }
                }
                for (int k = 0; k < board.length; k++) {
                    if (k == i) {
                        continue;
                    }
                    if (board[k][j] == character) {
                        return false;
                    }
                }
                int MaxI = 0;
                int MaxJ = 0;
                int MinI = 0;
                int MinJ = 0;
                int tempI = i % 3;
                int tempJ = j % 3;
                switch (tempI) {
                    case 0:
                        MinI = i;
                        MaxI = i + 2;
                        break;
                    case 1:
                        MinI = i - 1;
                        MaxI = i + 1;
                        break;
                    case 2:
                        MinI = i - 2;
                        MaxI = i;
                        break;
                    default:
                        break;
                }
                switch (tempJ) {
                    case 0:
                        MinJ = j;
                        MaxJ = j + 2;
                        break;
                    case 1:
                        MinJ = j - 1;
                        MaxJ = j + 1;
                        break;
                    case 2:
                        MinJ = j - 2;
                        MaxJ = j;
                        break;
                    default:
                        break;
                }
                for (int i2 = MinI; i2 <= MaxI; i2++) {
                    for (int j2 = MinJ; j2 <= MaxJ; j2++) {
                        if(i2 == i && j2 == j) {
                            continue;
                        }
                        if (character == board[i2][j2]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
