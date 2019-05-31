package com.leetcode.problems.problems_200;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.leetcode.explore.primaryalgorithm.TreeNode;

/*
 * 235. 二叉搜索树的最近公共祖先
 * 
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。

百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”

例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]

示例 1:
输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
输出: 6 
解释: 节点 2 和节点 8 的最近公共祖先是 6。

示例 2:
输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
输出: 2
解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。

 */
public class Solution235 {
	
	
	 public TreeNode lowestCommonAncestor_index(TreeNode root, TreeNode p, TreeNode q) {
		     if(root == null) {
		    	 return null;
		     }else if((root.val > p.val && root.val > q.val )) {
				 return lowestCommonAncestor_index(root.left ,p ,q);
			 }else if((root.val < p.val && root.val < q.val ) ) {
				 return lowestCommonAncestor_index(root.right ,p ,q);
			 }else if(root.val > p.val && root.val < q.val || (root.val < p.val && root.val > q.val)) {
				 return root;
			 }else if(root.val == p.val) {
				 return p;
			 }else if(root.val == q.val) {
				 return q;
			 }else {
				 return null;
			 }
	 }
	
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		 
		 Stack<TreeNode> sq = new Stack();
		 Stack<TreeNode> sp = new Stack();
//		 List<TreeNode> listp = new ArrayList();
//		 List<TreeNode> listq = new ArrayList();
		 
		 searchNode(root,p,sp);
		 searchNode(root,q,sq);
		 
		 int qi = 0;
		 int pi = 0;
		 
		 TreeNode node = null;
		 while(qi< sq.size() || pi< sp.size() ) {
			 
			 if( qi< sq.size() && pi< sp.size() && sq.peek().val == sq.peek().val ) {
				 node = sq.pop();
				 sp.pop();
			 }else {
				return node; 
			 }
		 }
		 
		 return  null;
	 }
	 
	// 找到 节点 p , 然后依次把节点放入到栈中
	private TreeNode searchNode(TreeNode root, TreeNode q, List  sq) {
		if(root  == null) {
			return null;
		}
		TreeNode tqlf = searchNode(root.left ,q,sq);
		if(tqlf != null ) {
			if(tqlf.val == root.left.val) {
				sq.add(root);
				return root;
			}
		}
		// 中序遍历
		if(root.val == q.val) {
			sq.add(root);
			return root;
		}
		
		TreeNode tqlr = searchNode(root.right ,q,sq);
		if(tqlr != null ) {
			if(tqlr.val == root.right.val) {
				sq.add(root);
				return root;
			}
		}
		
		return null;
	}
}
