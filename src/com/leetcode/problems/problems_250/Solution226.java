package com.leetcode.problems.problems_250;

import java.util.LinkedList;

import com.leetcode.explore.primaryalgorithm.TreeNode;

/**
* ClassName: Solution226 <br/>
* Function: 翻转二叉树. <br/>
* Reason: 刷题. <br/>
* date: 2019年5月6日 下午1:57:28 <br/>
*
* @author zhngtr-mi
*/
public class Solution226 {

    /**
               翻转一棵二叉树。

            示例：
            输入：
            
                 4
               /   \
              2     7
             / \   / \
            1   3 6   9
            输出：
                 4
               /   \
              7     2
             / \   / \
            9   6 3   1
            备注:
                    这个问题是受到 Max Howell 的 原问题 启发的 ：
                    谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。 
    *
    * @author zhngtr-mi
    * @since 2019-05-06
     */
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        TreeNode root1left = new TreeNode(4);
        TreeNode root1right = new TreeNode(5);
        root1.right = root1right;
        root1.left = root1left;

        TreeNode root14left = new TreeNode(1);
        TreeNode root14right = new TreeNode(2);
        root1left.left = root14left;
        root1left.right = root14right;
        
        LaywerTraversal(root1);
        System.out.println("================================");
        LaywerTraversal(invertTree(root1));
        
    }
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public static TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        invertTree(root.left);
        invertTree(root.right);
        return root;
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

	