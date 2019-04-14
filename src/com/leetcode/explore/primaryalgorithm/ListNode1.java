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
	    int[] nums = {0,0,1,2,4,5,1,9};
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
	    ListNode ln1 = new ListNode(nums[0]);
	    ListNode ln = ln1; 
	    for(int i=1;i<nums.length;i++) {
	        ln1.next = new ListNode(nums[i]);
	        ln1 = ln1.next;  
	    }
	   
	    
        return ln;
	}
	
	public  static ListNode addNextNode(ListNode node ,int val) {
	    return new ListNode(1);
	}
}
