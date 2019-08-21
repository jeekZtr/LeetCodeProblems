package com.nowcoder;

import com.leetcode.explore.primaryalgorithm.TreeNode;

public class Solution1_minimumdepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int run(TreeNode root) {
	        if(root == null){
	             return 0;   
	        }else if( root.right != null && root.left != null  ){
	            int leftint = run(root.left) ;
	            int rightint =  run(root.right);
	            return Math.min(leftint,rightint)+1;
	        }else if(root.left != null){
	                return  run(root.left) + 1;
	        }else {
	                return  run(root.right) + 1;
	        }
	}
}
