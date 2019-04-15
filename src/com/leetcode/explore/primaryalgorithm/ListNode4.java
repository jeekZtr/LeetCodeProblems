package com.leetcode.explore.primaryalgorithm;

/**
 * 链表
 * 
 * @author zhngtr-mi
 */
public class ListNode4 {
    /**
     * 
                  将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

                    示例：
                    
                    输入：1->2->4, 1->3->4
                    输出：1->1->2->3->4->4
    *
    * @author zhngtr-mi
    * @since 2019-04-14
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode list  = null;
        if(l1 !=null && l2!= null ) {
            if( l1.val <= l2.val  ) {
                list = l1;
                l1 =  l1.next;
            }else if(l2.val <= l1.val){
                list = l2;
                l2 =  l2.next;
            }
        }else if(l1 ==null && l2!= null){
            list = l2;
            l2 =  l2.next;
        }else if(l1 !=null && l2== null){
            list = l1;
            l1 =  l1.next;
        }
        ListNode curr = list;
        
        while(l1 != null || l2 != null) {
            if(l1 !=null && l2!= null ) {
                if( l1.val <= l2.val  ) {
                    curr.next = l1;
                    l1 =  l1.next;
                }else if(l2.val <= l1.val){
                    curr.next = l2;
                    l2 =  l2.next;
                }
            }else if(l1 ==null && l2!= null){
                curr.next = l2;
                l2 =  l2.next;
            }else if(l1 !=null && l2== null){
                curr.next = l1;
                l1 =  l1.next;
            }
            curr = curr.next ;
        }
        
        
        return list;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1,3,9};
        int[] nums2 = {0};
        ListNode ln1  =  initNode(nums1); 
        ListNode ln2 =  initNode(nums2); 
        ListNode ln = mergeTwoLists( null ,ln2 );
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
