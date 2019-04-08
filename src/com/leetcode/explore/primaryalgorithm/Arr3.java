package com.leetcode.explore.primaryalgorithm;

public class Arr3 {
	
		public static void main(String args[]) {
			int[] a = {1,2,3,4,5,6,7};
			String b = "[ ";
			rotate(a,3);
			for(int i = 0;i<a.length;i++) {
				b = b+ a[i] + ",";
			}
			System.out.println(b );
		}
		/**
		 * 	暴力破解法
		 * @param nums
		 * @param k
		 */
	    public static void rotate(int[] nums, int k) {
	        if(nums != null && nums.length >1 ){
	            int length = nums.length;
	            int move = k%length;
	            
	            int temp,j = 0;
	           
	           while(j < move){
	               
	               for(int i=0;i<length;i++){
	                    temp = nums[i]; 
	                    nums[i] = nums[length-1];
	                    nums[length-1] = temp;
	               } 
	               j++;
	           }
	        }
	        
	    }
	    /**
		 * 	一次到位法
		 * @param nums
		 * @param k
		 */
	    public static void rotate_once(int[] nums, int k) {
	        if(nums != null && nums.length >1 ){
	            int length = nums.length;
	            int move = k%length;
	            
	        }
	        
	    }
}
