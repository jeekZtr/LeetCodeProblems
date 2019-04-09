package com.leetcode.explore.primaryalgorithm;

public class Arr5 {
	/*
	 * 	ֻ����һ�ε�����
	 * 	����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
	 */
	public static void main(String args[]) {
		int[] a = { 3,3,2,1,2};

		System.out.println( singleNumber(a));
	}
	
	public static int singleNumber(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			boolean flag =false;
			for (int j = 0; j < nums.length; j++) {
				
				if (nums[i] == nums[j] && i!=j) {
					flag = true;
				}
			}
			if(!flag) {
				return nums[i];
			}
		}
		return 0;
	}
	/**
	 * 1	��Ϊ�����г���һ��Ԫ��ֻ����һ��֮�⣬������Ԫ�ض��������Σ�
	 * 2	��������е����������ͬ���������Ϊ0�����ֻʣ�³���һ�ε����֣�����0��򣬽������������
	 */
	
	 /**
     * ^�������������������Ҳ����˵�������ͬһ������������䣬��(a xor b) xor b = a��
		xor����������ڼ򵥵ļ��ܣ�
		�����������MM˵1314520�����±���֪��������˫��Լ�����ҵ�����19880516��Ϊ��Կ��
		1314520 xor 19880516 = 20665500���ҾͰ�20665500����MM��
		MM�ٴμ���20665500 xor 19880516��ֵ���õ�1314520�����������������ҵ���ͼ��
     */
   public int singleNumber_yihuo(int[] nums) {
       //nums=[2,2,1]
       //����Ԫ��result
       int result = 0;
       for(int i = 0; i < nums.length; i++){
           //��ʼ���а�λ�������������� 
           //��һ��ѭ����result=0 ��� 2 ,��ֵ��ͬ��λȡ�� ,result ���2
           //�ڶ���ѭ����result=2 ��� 2 ,��ֵ��ͬ ,result ���0
           //������ѭ����result=0 ��� 1 ,��ֵ��ͬ��λȡ�� ,result ���1
           result = result ^ nums[i];
       }
       return result;
   }
}
