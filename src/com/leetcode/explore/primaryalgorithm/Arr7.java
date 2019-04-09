package com.leetcode.explore.primaryalgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arr7 {
	/*
	 * 	����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��

		���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�
		
		����Լ���������� 0 ֮�⣬��������������㿪ͷ��
		
		ʾ�� 1:
		
		����: [1,2,3]
		���: [1,2,4]
		����: ���������ʾ���� 123��
		
		ʾ�� 2:
		
		����: [4,3,2,1]
		���: [4,3,2,2]
		����: ���������ʾ���� 4321��


	 */
	public static void main(String args[]) {
		int[] a = { 9};
		a = plusOne(a);
		for(int c:a) {
			System.out.print(c);
		}
		//System.out.println( plusOne(a));
	}
	
	public static int[] plusOne(int[] digits) {
		int plus = 0;
		for(int i=digits.length-1;i>=0;i--) {
			if(plus == 1 || i==digits.length-1) {
				if( digits[i]+1 > 9) {
					digits[i] = digits[i]+1 -10;
					plus = 1;
					if(i == 0) {
						int[] e = new int[digits.length+1];
						e[0] =1;
						for(int j=1;j<digits.length+1;j++) {
							e[j] = 0;
						}
						return e;
					}
				}else {
					digits[i] = digits[i]+1 ;
					break;
				}
			}else {
				break;
			}
		}
	    return digits;
    }
}
