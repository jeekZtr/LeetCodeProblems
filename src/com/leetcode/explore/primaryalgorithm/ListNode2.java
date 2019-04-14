package com.leetcode.explore.primaryalgorithm;

/**
 * 链表
 * 
 * @author zhngtr-mi
 */
public class ListNode2 {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 * 
	 * 删除链表的倒数第N个节点
	 * 
	 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
	 */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = head,d = head;
        int length = 1;
        while( head != null ) {
            head = head.next;
            length ++;
        }
        int dle = length - n;
        while( h != null ) {
            h = h.next;
            if(length == dle) {
                h.val = h.next.val;
                h.next = h.next.next;
            }
            length --;
        }
        
        return d;
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
	    
	    for(int i=0;i<nums.length;i++) {
	        ListNode ln2 = null ;
	        if(i==0) {
	            ln2 = new ListNode(nums[i]);
	        }else {
	            ln2.next = new ListNode(nums[i]);
	        }
	    }
	    
        return ln1;
	}
}
