package com.leetcode.explore.primaryalgorithm;

import java.util.HashSet;

public class Arr10 {
	/*
	 * 	�ж�һ�� 9x9 �������Ƿ���Ч��ֻ��Ҫ�������¹�����֤�Ѿ�����������Ƿ���Ч���ɡ�

		    ���� 1-9 ��ÿһ��ֻ�ܳ���һ�Ρ�
		    ���� 1-9 ��ÿһ��ֻ�ܳ���һ�Ρ�
		    ���� 1-9 ��ÿһ���Դ�ʵ�߷ָ��� 3x3 ����ֻ�ܳ���һ�Ρ�

	 */
	public static void main(String args[]) {
	}
	 public boolean isValidSudoku(char[][] board) {
	        //�����ѭ����ÿ��ѭ������ֻ�Ǵ����i�У����Ǵ����i�С���i���Լ���i��3x3�ľŹ���
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
