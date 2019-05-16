package com.leetcode.problems.problems_050;

import com.leetcode.explore.primaryalgorithm.ListNode;

public class Solution02 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode v = new ListNode(0);
		ListNode t = v;

		while (l1 != null || l2 != null) {
			int e = 0;
			int tmp = 0;
			if (l1 != null) {
				tmp = tmp + l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				tmp = tmp + l2.val;
				l2 = l2.next;
			}
			tmp = tmp + t.val;
			t.val = tmp % 10;
			e = tmp / 10;

			if (l1 != null || l2 != null || e != 0) {
				t.next = new ListNode(e);
				t = t.next;
			}

		}
		return v;
	}
}
