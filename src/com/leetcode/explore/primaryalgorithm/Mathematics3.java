package com.leetcode.explore.primaryalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mathematics3 {
	/**
                    给定一个整数，写一个函数来判断它是否是 3 的幂次方。
                    示例 1:
                    
                    输入: 27
                    输出: true
                    示例 2:
                    
                    输入: 0
                    输出: false
                    示例 3:
                    
                    输入: 9
                    输出: true
                    示例 4:
                    
                    输入: 45
                    输出: false
                    进阶：
                    你能不使用循环或者递归来完成本题吗？
	 */
	 public static boolean isPowerOfThree(int n) {
	     int sum = 0;
	     boolean flag = false;
	     if(n%3!=0 && n!=1){
             return flag;
         }
	     for(int i=1;i<=n;i++) {
	         if( sum <= n ) {
	             sum = 3*sum ==0 ? 1 : 3*sum ;
	             if(sum == n) {
	                 return true;
	             }
	         }else {
	             return flag;
	         }
	         
	     }
	     return  flag; 
	 }
	 
	 public static void main(String args[]) {
	     
		 System.out.println(isPowerOfThree(1));
	 }
}
