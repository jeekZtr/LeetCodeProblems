package com.leetcode.problems.problems_050;

import com.leetcode.explore.primaryalgorithm.ListNode;

/**
 * 	合并K个排序链表
 * 
 * 
 *      合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。

	示例:
	
	输入:
	[
	  1->4->5,
	  1->3->4,
	  2->6
	]
	输出: 1->1->2->3->4->4->5->6


 * 
 * 
 * @author zhang
 *
 */
public class Solution23 {
	public static void main(String args[]) {
		int[] a = {1,4,5};
		int[] b = {1,3,4};
		int[] c = {2,6};
		ListNode[] ln = { ListNode.initNode(a), ListNode.initNode(b), ListNode.initNode(c) };
//		mergeKLists(ln) ;
		ListNode.sysoNode( mergeKLists(ln) );
	}
	
	public static ListNode mergeKLists(ListNode[] lists) {
		ListNode ln = null;
		
		for(int i=0;i<lists.length;i++) {
			if(i == 0) {
				ln = lists[0];
				continue;
			}
			ListNode temp = lists[i];
			// 合并两个有序链表
			ln = merge(temp,ln);
			//System.out.println("-----------------------");
			//ListNode.sysoNode(ln);
			
		}
		return ln;
    }
	private  static ListNode merge(ListNode temp, ListNode ln) {
		ListNode l = ln;
		
		ListNode res =  null ;
		if(temp != null || l !=null) {
			res = new ListNode(0); 
		}
		ln =res;
		while(temp != null || l !=null ) {
			if(temp != null &&  l !=null &&  temp.val >= l.val) {
				res.val = l.val;
				l = l.next;
			}else if(temp != null &&  l !=null &&  temp.val < l.val) {
				res.val = temp.val;
				temp = temp.next;
			}else if(temp == null &&  l !=null ) {
				res.val = l.val;
				l = l.next;
			}else  if(temp != null &&  l ==null ){
				res.val = temp.val;
				temp = temp.next;
			}
			if(temp != null || l !=null ) {
				res.next = new ListNode(0);
				res = res.next;
			}
		}
		return ln;
	}
}
