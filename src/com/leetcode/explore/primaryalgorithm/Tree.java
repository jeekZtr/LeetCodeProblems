package com.leetcode.explore.primaryalgorithm;

public class Tree {

    public static void main(String args[]) {
        int[] a = {3,9,20,-1,-1,15,7};
         
    }
    
    public static int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int l1 = maxDepth(root.left);
        int l2 = maxDepth(root.right);
        return Math.max(l1,l2)+1;
    }
    
    public static TreeNode initTreeNode(int[] nums) {
        TreeNode tn = new TreeNode(-1);
        tn.val = nums[0];
        tn.left = new TreeNode(nums[1]);
        tn.right = new TreeNode(nums[2]);
        
        
        return null;
    } 
}