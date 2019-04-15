package com.leetcode.explore.primaryalgorithm;

/**
 * 链表
 * 
 * @author zhngtr-mi
 */
public class ListNode5 {
    /**
     *  请判断一个链表是否为回文链表。

		示例 1:
		
		输入: 1->2
		输出: false
		
		示例 2:
		
		输入: 1->2->2->1
		输出: true
		
		进阶：
		你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
     */
    public static boolean isPalindrome(ListNode head) {
        if(head == null) {
        	return true;
        }else if(head.next == null) {
        	return true;
        }
        ListNode curr = head;
        int o = 0;
        while(head != null) {
        	head = head.next;
        	o++;
        }
        int[] arr = new int[o];
        int i = 0;
        while(curr != null) {
        	arr[i] = curr.val;
        	curr = curr.next;
        	i++;
        }
        for(i=0;i<o/2;i++) {
        	if(arr[i] != arr[o-i-1]) {
        		return false ;
        	}
        }
    	return true;
    }
    public static boolean isPalindrome_1(ListNode head) {
        if(head == null || head.next == null ) {
        	return true;
        }
        
        ListNode fast  = head , slow  = head;
        while(fast.next != null && fast.next.next != null ) {
        	fast = fast.next.next;
        	slow  = slow.next;
        }
        slow = reverse(slow.next);
        while(slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    private static ListNode reverse(ListNode head){
        // 递归到最后一个节点，返回新的新的头结点
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,1,1};
        int[] nums2 = {0};
        ListNode ln  =  initNode(nums1); 
        ListNode ln2 =  initNode(nums2); 
        boolean flag = isPalindrome_1( ln );
        System.out.println(flag);
        while( ln  != null) {
            System.out.print(ln.val + ",");
            ln = ln.next;
        }
    }  
    /**
     * 
    * initNode:根据数组初始化一个单向链表. <br/>
    *
    * @author zhngtr-mi
    * @since 2019-04-12
     */
    public  static ListNode initNode(int[] nums) {
        if(nums == null || nums.length == 0) {
             return null;
        }
        ListNode ln1 = new ListNode(nums[0]);
        ListNode ln = ln1; 
        for(int i=1;i<nums.length;i++) {
            ln.next = new ListNode(nums[i]);
            ln = ln.next;  
        }
        return ln1;
    }
    
}
