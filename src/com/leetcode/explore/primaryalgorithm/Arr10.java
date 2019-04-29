package com.leetcode.explore.primaryalgorithm;

import java.util.HashSet;
import java.util.Set;

public class Arr10 {
	/**
	 * 解题思路
	 * 	只要所有的 行 列 和 方格中没有相同的数字即为 有效的数独
	 *   难点是怎么表示, 和怎么存储  行列方格的数据
	 *   
	 *   
输入:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
输出: true
	 * @param board
	 * @return
	 */
	public static boolean isValidSudoku(char[][] board) {
		
		for(int i=0;i<9;i++) {
//			// 分别表示 第 i 行 , 第 i 列, 第i个 方格
			Set col = new HashSet(); //行
			Set row = new HashSet(); //列
			Set cube = new HashSet(); //方格
			for(int j=0;j<9;j++) {
				if('.'!=board[i][j] && !col.add(board[i][j] ) ){
					return false;
				}
				if('.'!=board[j][i] && !col.add(board[j][i] ) ){
					return false;
				}
				int m = i/3*3 + j/3;
				int n = i%3*3 + j%3;
				System.out.println("m--"+m+",n--"+n);
				if('.'!=board[m][n] && !col.add(board[m][n] ) ){
					return false;
				}
			}
			System.out.println("--------------------------------");
		}
		return true;
	}
	
	public static void main(String args[]) {
	    
	    isValidSudoku(null);
	}
}
