package com.leetcode.explore.primaryalgorithm;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        
        
        return "ListNode [val=" + val + ", next=" + next + "]";
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
	
	
	public static void sysoNode(ListNode l) {
		while(l != null) {
			System.out.print(l.val + "  ");;
			l = l.next;
		}
		System.out.println();;
	}
	
}
