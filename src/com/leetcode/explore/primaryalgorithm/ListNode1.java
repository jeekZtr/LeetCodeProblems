package com.leetcode.explore.primaryalgorithm;

/**
 * 链表
 * 
 * @author zhngtr-mi
 */
public class ListNode1 {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 * 
	 * 删除链表中的节点
	 * 
	 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
	 */
	public  static void deleteNode(ListNode node) {
	    node.val = node.next.val;
	    node.next = node.next.next;
    }
	
	public static void main(String[] args) {
	    int[] nums = {4,5,1,9};
	    ListNode  ln =  initNode(nums); 
	    while( ln  != null) {
	        System.out.print(ln.val);
	        ln = ln.next;
	    }
	    
	    //deleteNode(ln);
	}  
	/**
	 * 
	* initNode:根据数组初始化一个单向链表. <br/>
	*
	* @author zhngtr-mi
	* @since 2019-04-12
	 */
	public  static ListNode initNode(int[] nums) {
	    ListNode ln1 = new ListNode(4);
	    ln1.next = new ListNode(5);
	    ln1.next.next = new ListNode(1);
	    ln1.next.next.next = new ListNode(9);
	    System.out.println(1);
	    
	   
	    
        return ln1;
	}
	
	public  static ListNode addNextNode(ListNode node ,int val) {
	    return new ListNode(1);
	}
}
