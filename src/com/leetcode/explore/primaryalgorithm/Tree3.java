package com.leetcode.explore.primaryalgorithm;

public class Tree3 {
	
   /**
    * 	给定一个二叉树，检查它是否是镜像对称的。

		例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
		    1
		   / \
		  2   2
		 / \ / \
		3  4 4  3
		
		但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
		    1
		   / \
		  2   2
		   \   \
		   3    3
		说明:
		
		如果你可以运用递归和迭代两种方法解决这个问题，会很加分。

    * @param root
    * @return
    */
	public static boolean isSymmetric(TreeNode root) {
		if(root == null ) return true;
        return isSymmetric(root.left) && isSymmetric(root.right);
    }
	
	public static boolean isSymmetric(TreeNode left ,TreeNode right) {
		if(left  == null && right == null) {
			return true;
		}else if(left  == null || right == null){
			return false;
		}
		if(left.val != right.val ) {
			return false;
		}
		return true;
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
