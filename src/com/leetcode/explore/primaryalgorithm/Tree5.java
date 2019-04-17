package com.leetcode.explore.primaryalgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree5 {
	
   /**

		将有序数组转换为二叉搜索树
		
		将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
		
		本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
		
		示例:
		
		给定有序数组: [-10,-3,0,5,9],
		
		一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
		
		      0
		     / \
		   -3   9
		   /   /
		 -10  5


    * @param root
    * @return
    */
	public static  TreeNode sortedArrayToBST(int[] nums) {
		
		  return sortedArrayToBST(nums,0,nums.length-1);
	        
    }
    public static TreeNode sortedArrayToBST(int [] nums,int left,int right){
        if(left>right)return null;                                        //边界条件，注意是left>right  
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);          
        root.left=sortedArrayToBST(nums,left,mid-1);        //递归向左探索，范围变成left~mid-1;
        root.right=sortedArrayToBST(nums,mid+1,right);
        return root;
    }
	
	
	
	public  static void main(String args[]) {
		int[] nums = {1,2,3,4,5,6,9};
		
	}
	public static TreeNode initTreeNode(int[] nums ) {
		TreeNode tn = null;
		for(int i=0;nums!=null && i<nums.length;i++){
			int val = nums[i];
			if(i == 0) {
				tn = new TreeNode(val);
			}if(i == 1 && val != -1) {
				tn.left = new TreeNode(val);
			}if(i == 2 && val != -1) {
				tn.right = new TreeNode(val);
			}
			
			
		}
		
		
		return tn;
	}
	
}
