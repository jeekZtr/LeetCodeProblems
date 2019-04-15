package com.leetcode.explore.primaryalgorithm;

/**
 * 链表
 * 
 * @author zhngtr-mi
 */
public class ListNode3 {
    /**
     * 
                    反转一个单链表。
                    
                    示例:
                    
                    输入: 1->2->3->4->5->NULL
                    输出: 5->4->3->2->1->NULL
                    进阶:
                    你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
    *
    * @author zhngtr-mi
    * @since 2019-04-14
     */
    public static ListNode reverseList(ListNode head) {
       
        if(head == null || head.next== null) {
            return head;
        }
        
        ListNode curr = head.next;
        head.next = null;
        while(curr != null) {
            ListNode s =curr.next;
            curr.next = head;
            head = curr;
            curr = s;
        }
        
        
        return head;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,3,9,2,8,5,4,7,6};
        ListNode ln  =  initNode(nums); 
        ln = reverseList( ln );
        while( ln  != null) {
            System.out.print(ln.val);
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
            ln1.next = new ListNode(nums[i]);
            ln1 = ln1.next;  
        }
        return ln;
    }
    
}
