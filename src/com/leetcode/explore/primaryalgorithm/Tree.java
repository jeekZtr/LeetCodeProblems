package com.leetcode.explore.primaryalgorithm;

public class Tree {
	
	/**
	 *  验证二叉搜索树

		给定一个二叉树，判断其是否是一个有效的二叉搜索树。
		
		假设一个二叉搜索树具有如下特征：
		
		节点的左子树只包含小于当前节点的数。
		节点的右子树只包含大于当前节点的数。
		所有左子树和右子树自身必须也是二叉搜索树。
		
		示例 1:
		输入:
		    2
		   / \
		  1   3
		输出: true
		
		示例 2:
		输入:
		    5
		   / \
		  1   4
		     / \
		    3   6
		输出: false
		解释: 输入为: [5,1,4,null,null,3,6]。
		根节点的值为 5 ，但是其右子节点值为 4 。


	 * @param root
	 * @return
	 */
	
	public static boolean isValidBST(TreeNode root) {
		if(root == null) {
			return  true;
		}
		if(root.left == null && root.right == null) {
			return true;
		}
		if(root.left == null || root.right == null) {
			return false;
		}
		if(root.val <= root.left.val && root.val >= root.right.val) {
			return false;
		}
		boolean a = isValidBST(root.left);
		boolean b = isValidBST(root.right);
		return a && b;
		
    }
	
	/**
	 * 官网给出的标准解法
	 * 		也是利用了递归的思想，分别对每一个子树进行判断，但是它的亮点在于在判断的时候并不需要对子树进行搜索“最相近的值”，而是利用了“最大值”、“最小值”的思想：
			对于每个子树，都有一个最大值和一个最小值，
			对于左子树，最大值就是它的根节点的值，最小值是根节点的最小值（左父亲或者MIN_VALUE）
			对于右子树，最小值就是它的根节点的值，最大值是根节点的最大值（右父亲或者MAX_VALUE）
	 * @param root
	 * @return
	 */
	public boolean isValidBST_stand(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
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
