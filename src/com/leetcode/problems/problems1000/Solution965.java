
package com.leetcode.problems.problems1000;

import com.leetcode.explore.primaryalgorithm.TreeNode;

/**
 *
单值二叉树

如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
只有给定的树是单值二叉树时，才返回 true；否则返回 false。
* date: 2019年5月13日 下午5:58:24 <br/>
*
* @author zhngtr-mi
 */
public class Solution965 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
    
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){ return true;}
        return showTree(root ,root.val);
    }
    
    public static boolean showTree(TreeNode r,int val){
        if(r == null){
            return true;
        }
        if(r.val !=val){
            return false;
        }
            
        return showTree(r.left,val) && showTree(r.right,val);
       
    }
}

	