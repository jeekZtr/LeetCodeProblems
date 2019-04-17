package com.leetcode.explore.primaryalgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree4 {
	
   /**
		 二叉树的层次遍历
		
		给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
		
		例如:
		给定二叉树: [3,9,20,null,null,15,7],
		
		    3
		   / \
		  9  20
		    /  \
		   15   7
		
		返回其层次遍历结果：
		
		[
		  [3],
		  [9,20],
		  [15,7]
		]


    * @param root
    * @return
    */
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list= new ArrayList<List<Integer>>();
		if(root == null) {
			return list;
		}
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
        	int count  = q.size();
        	List<Integer> l = new ArrayList<Integer>();
        	while(count >0) {
        		TreeNode t = q.poll();
        		l.add(t.val);
        		if(t.left!=null) { q.offer(t.left); }
        		if(t.right!=null) {q.offer(t.right);}
        		count --;
        	}list.add(l);
        }
        
        return list;
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
