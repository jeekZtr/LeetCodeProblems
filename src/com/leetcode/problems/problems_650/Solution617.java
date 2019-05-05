package com.leetcode.problems.problems_650;

import java.util.LinkedList;

import com.leetcode.explore.primaryalgorithm.TreeNode;

/**
 * 合并二叉树
 * 
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。

                你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
                
                示例 1:
                
                输入: 
                    Tree 1                     Tree 2                  
                          1                         2                             
                         / \                       / \                            
                        3   2                     1   3                        
                       /                           \   \                      
                      5                             4   7                  
                输出: 
                合并后的树:
                         3
                        / \
                       4   5
                      / \   \ 
                     5   4   7
                注意: 合并必须从两个树的根节点开始。
 * 
 * [1,3,2,5]
   [2,1,3,null,4,null,7]
 * 
 * 
* ClassName: Solution617 <br/>
* Function: TODO ADD FUNCTION. <br/>
* Reason: TODO ADD REASON(可选). <br/>
* date: 2019年5月5日 下午2:17:20 <br/>
*
* @author zhngtr-mi
 */
public class Solution617 {
    
    public  static void main(String args[]) {
        // [3,4,5,1,2]
        // [4,1,2,8,9]
        TreeNode root1 = new TreeNode(3);
        TreeNode root1left = new TreeNode(4);
        TreeNode root1right = new TreeNode(5);
        root1.right = root1right;
        root1.left = root1left;

        TreeNode root14left = new TreeNode(1);
        TreeNode root14right = new TreeNode(2);
        root1left.left = root14left;
        root1left.right = root14right;
        
        
        TreeNode root2 = new TreeNode(4);
        TreeNode root2left = new TreeNode(1);
        TreeNode root2right = new TreeNode(2);
        root2.left = root2left;
        root2.right = root2right;
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(9);
        root2left.left = node1;
        root2left.right = node2;

        TreeNode r = null;
        LaywerTraversal(root1);
        System.out.println("root1");
        LaywerTraversal(root2);
        System.out.println("root2");
        LaywerTraversal(mergeTrees(root1,root2));
        
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode t = null;
        if(t1!= null ) {
            t = new TreeNode(t1.val);
        }
        if(t2!= null ) {
            if(t!=null) {
                t.val = t.val + t2.val;
            }else {
                t = new TreeNode(t2.val);
            }
        }
        if( (t2!=null&& t2.left != null) || (t1!=null && t1.left != null) ){
             t.left = new TreeNode(0);
        }
        if( (t2!=null&& t2.right != null) || (t1!=null && t1.right != null) ){
             t.right = new TreeNode(0);
        }
        if(t1 != null){
           addTreeToTree(t1.left,t.left);
           addTreeToTree(t1.right,t.right); 
        }
        System.out.println("----------------t2-------------------------");
        if(t2 != null ){
           addTreeToTree(t2.left,t.left);
           addTreeToTree(t2.right,t.right);
        }
        return t;
    }
    
    public static TreeNode addTreeToTree(TreeNode f, TreeNode res) {
        System.out.println("--------------------------------------------------");
        if(f == null) {
            return null;
        }
        System.out.println("f.val -- "+ f.val );
        
        if(res != null) {
            System.out.println("res.val ------ "+  res.val );
            System.out.println("res      地址-- "+ res );
            res.val = res.val + f.val;
            
        }else {
            res = new TreeNode(f.val);
        }
        System.out.println("res.val  结果-- "+ res.val );
        if(f.left != null ){
           if(res.left == null ) {
               res.left = new TreeNode(0); 
           }
           System.out.println("res.left 地址-- "+ res.left );
           addTreeToTree(f.left,res.left);
        }
        if(f.right != null){
           if(res.right == null) {
               res.right = new TreeNode(0); 
           }
           System.out.println("res.right 地址-- "+ res.right );
           addTreeToTree(f.right,res.right);
        }
        if(f.left == null && f.right == null) {
            return null;
        }
        return res;
        
        
    }
    
    
    
    public static void midTran(TreeNode root) {
        if (root == null)
            return;
        System.out.println("midTran---"+root.val);
        if (root.left != null)
            midTran(root.left);
        if (root.right != null)
            midTran(root.right);
    }
    public static void LaywerTraversal(TreeNode root){
        if(root==null) return;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();  
        list.add(root);
        TreeNode currentNode;
        while(!list.isEmpty()){
            currentNode=list.poll();
            System.out.println(currentNode.val);
            if(currentNode.left!=null){
                list.add(currentNode.left);
            }
            if(currentNode.right!=null){
                list.add(currentNode.right);
            }
        }
    }
}

	