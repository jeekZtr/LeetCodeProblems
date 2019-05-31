package com.leetcode.problems.problems_200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution169 {
    
    public static void main(String args[]) {
//        int[] a  = {3,2,1,1,1,1};
//        int[] a  = {3,2,1,1,1,1};
//        int[] a  = {3,2,1,1,1,1};
        int[] a  = {3,3,0,1,2,2};
        
        System.out.println(majorityElement_moer(a));
    }
    
    public static int majorityElement(int[] nums) {
        int len = nums.length;
        
       Map<Integer,Integer> map = new HashMap();
       for(int m:nums){
           Integer size = map.get(m);
           if( size == null){
               map.put(m,1);
           }else{
               
               map.put(m,size+1);
           }
       }
       Set set = map.keySet();
       for(Iterator it = set.iterator();it.hasNext();){
           Integer key = (Integer) it.next();
           if( map.get(key) > len/2 ){
               return key;
           }
       }
        return 0;
    }
    
    public static int majorityElement_moer(int[] nums) {
        int count = 1;
        int num = nums[0];
        for(int i=1;i<nums.length;i++) {
               if(count == 0) {
                   count ++;
                   num = nums[i];
               } else {
                   if( nums[i] != num ) {
                       count--;
                   }else {
                       count++;
                   }
               }
            
        }
        return num ;
    }
}

	