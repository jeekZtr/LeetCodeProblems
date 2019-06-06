package com.leetcode.problems.problems_100;

import java.math.BigDecimal;

public class Solution62 {
	 public static void main(String[] args) {
        System.out.println("asdfasdf   "+ uniquePaths(1,1)  );    
		 //A(5,5);
	 }
	 public static int uniquePaths(int m, int n) {
	     int[][] a = new int[m][n];
	     for(int i=0;i<a.length;i++) {
	         for(int j=0;j<a[i].length;j++) {
	             if(i==0 || j==0) {
	                 a[i][j] = 1;
	             }else {
	                 a[i][j] = a[i-1][j] + a[i][j-1];
	             }
	         }
	     }
	     
	     return a[m-1][n-1];
	 }
	 public static int uniquePaths_quqiao(int m, int n) {
	     BigDecimal dd = new BigDecimal(m+n-2);
	     BigDecimal sum = new BigDecimal(1);
	     BigDecimal sumdd = new BigDecimal(1);
	     for(int i=m-1;i>0;i--){
	         sum = sum.multiply(new BigDecimal(i));
	         sumdd = sumdd.multiply(dd);
	         dd = dd.subtract(new BigDecimal(1));
	     }
	     return  sumdd.divide(sum).toBigInteger().intValue();
	 }
//	  public static int uniquePaths(int m, int n) {
//	        int sum = 1;
//	        int sumd = 1;
//	        int dd = m+n-2;
//	        for(int i=m-1;i>0;i--){
//	            sum = sum * i;
//	            System.out.println(sum);
//	            sumd = sumd *(dd);
//	            dd--;
//	        }
//	       
//	        return  sumd/sum;
//	    }
	 
	 /**
		 * 数学中的统计方法，用于整数，A(3,2)即3*2,A(5,3)即5*4*3
		 * @param first 开始的数
		 * @param second 个数
		 * @return 
		 */
		public static int A(int first , int second)
		{
			int tmp = first;
			int result = first;
			int count = 0;
			while(count < second-1)
			{
				if(second ==1)
				{
					return first;
				}
				else
				{
					count++;
					tmp--;
					System.out.println(result + "*" + tmp);
					result = result * tmp;	
				}
			}
			return result;
		}

}
