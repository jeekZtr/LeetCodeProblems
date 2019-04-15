package com.leetcode.explore.primaryalgorithm;

/**
 * 链表
 * 
 * @author zhngtr-mi
 */
public class ListNode6 {
   
	public static boolean hasCycle(ListNode head) {
		
		// if(head == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        //如果有环， 则fast指针永远跑不完。并且最终会碰到slow指针
        //如果无环， 则会提前fast指针会跑到结尾终止。
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
		return false;
    }
	
    public static void main(String[] args) {
        int[] nums1 = {1,1,1};
        int[] nums2 = {0};
        ListNode ln  =  initNode(nums1); 
        ListNode ln2 =  initNode(nums2); 
        boolean flag = hasCycle( ln );
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
