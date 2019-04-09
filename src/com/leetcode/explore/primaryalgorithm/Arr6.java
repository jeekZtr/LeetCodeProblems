package com.leetcode.explore.primaryalgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arr6 {
	/*
	 * 	ֻ����һ�ε�����
	 * 	����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
	 */
	public static void main(String args[]) {
		int[] a = { 3,3,2,1,2};

		System.out.println( intersect(a,a));
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		 Map<Integer ,Integer> counter = new HashMap<Integer ,Integer>();
			for(int a:nums1) {
				if(counter.containsKey(a)) {
					counter.put(a, counter.get(a)+1);
				}else {
					counter.put(a, 1);
				}
			} 
			List<Integer> resList = new ArrayList<Integer> ();		
			for(int b:nums2) {
				if(counter.containsKey(b) && counter.get(b)>0) {
					resList.add(b);
					counter.put(b, counter.get(b)-1);
				}
			}
			 int[] result = new int[resList.size()];
			 //Ϊ������Ŀ����ֵ���ͣ���listת��Ϊint����
			 for (int i = 0; i < result.length; i++) {
			     result[i] = resList.get(i);
			 }
	        return result;
    }
}
