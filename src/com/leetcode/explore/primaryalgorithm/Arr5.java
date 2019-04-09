package com.leetcode.explore.primaryalgorithm;

public class Arr5 {
	/*
	 * 	只出现一次的数字
	 * 	给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
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
	 * 1	因为数组中除了一个元素只出现一次之外，其它的元素都出现两次，
	 * 2	如果把所有的数都异或，相同的数字异或为0，最后只剩下出现一次的数字，它和0异或，结果就是它本身。
	 */
	
	 /**
     * ^运算的逆运算是它本身，也就是说两次异或同一个数最后结果不变，即(a xor b) xor b = a。
		xor运算可以用于简单的加密，
		比如我想对我MM说1314520，但怕别人知道，于是双方约定拿我的生日19880516作为密钥。
		1314520 xor 19880516 = 20665500，我就把20665500告诉MM。
		MM再次计算20665500 xor 19880516的值，得到1314520，于是她就明白了我的企图。
     */
   public int singleNumber_yihuo(int[] nums) {
       //nums=[2,2,1]
       //定义元数result
       int result = 0;
       for(int i = 0; i < nums.length; i++){
           //开始进行按位异或运算的逆运算 
           //第一次循环，result=0 异或 2 ,数值不同按位取反 ,result 变成2
           //第二次循环，result=2 异或 2 ,数值相同 ,result 变成0
           //第三次循环，result=0 异或 1 ,数值不同按位取反 ,result 变成1
           result = result ^ nums[i];
       }
       return result;
   }
}
