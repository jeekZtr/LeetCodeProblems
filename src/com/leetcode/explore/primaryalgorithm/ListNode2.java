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
     * 1删除链表的数第N个节点
     * 
     * 2给定一个链表，删除链表的数第 n 个节点，并且返回链表的头结点。
     */
    public static ListNode removeNth(ListNode head, int n) {
//        ListNode h = head,d = head;
//        int length = 1;
//        while( head != null ) {
//            head = head.next;
//            length ++;
//        }
//        int dle = length - n;
        ListNode curr =head ;
        int i=1;
        while(i<n) {
            //System.out.println(curr.val);
            head = head.next;
            i++;
        }
        head.val = head.next.val;
        head.next = head.next.next;
       // System.out.println(curr.val);
        while( curr  != null) {
              System.out.print(curr.val);
              curr = curr.next;
        }
        return curr;
    }
    
    public static void main(String[] args) {
        int[] nums = {};
        ListNode ln  =  initNode(nums); 
//      while( ln  != null) {
//          System.out.print(ln.val);
//          ln = ln.next;
//      }
        ln = removeNthFromEnd( ln , 4);
        //deleteNode(ln);
//      System.out.println();
//      
//      while( ln  != null) {
//            System.out.print(ln.val);
//            ln = ln.next;
//        }
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
    /**
     *     
    * removeNthFromEnd:使用两个节点，一个是first一个是second。先让first走n步，然后再让first和second同时往前走，当first走到头时，second即是倒数第n+1个节点了。 <br/>
    *
    * @author zhngtr-mi
    * @since 2019-04-14
     */
     public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode right= head,left = head;
            for(int i = 0;i<n;i++)
            {
                right = right.next;
            }
            if(right == null){
                head = head.next;
                return head;
            }
            while(right.next != null){
                right = right.next;
                left = left.next;
            }
            left.next = left.next.next;
            
            return head;
      }
}
