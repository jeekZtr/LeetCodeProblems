package com.leetcode.explore.primaryalgorithm;

import java.util.HashSet;

public class Arr10 {
	/*
	 * 	判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。

		    数字 1-9 在每一行只能出现一次。
		    数字 1-9 在每一列只能出现一次。
		    数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。

	 */
	public static void main(String args[]) {
	}
	 public boolean isValidSudoku(char[][] board) {
	        //最外层循环，每次循环并非只是处理第i行，而是处理第i行、第i列以及第i个3x3的九宫格
	        for(int i = 0; i < 9; i++){
	            HashSet<Character> line = new HashSet<>();
	            HashSet<Character> col = new HashSet<>();
	            HashSet<Character> cube = new HashSet<>();
	            for(int j = 0; j < 9; j++){
	                if('.' != board[i][j] && !line.add(board[i][j]))
	                    return false;
	                if('.' != board[j][i] && !col.add(board[j][i]))
	                    return false;
	                int m = i/3*3+j/3;
	                int n = i%3*3+j%3;
	                if('.' != board[m][n] && !cube.add(board[m][n]))
	                    return false;
	            }
	        }
	        return true;
	    }
}
