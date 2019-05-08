package com.leetcode.problems.problems_950;

import java.util.*;

public class Solution929 {
    
    public static void main(String args[]) {
      String[] emails = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
         System.out.println( numUniqueEmails(emails)); 
    }
    
    
    public static int numUniqueEmails(String[] emails) {
        Set set = new  HashSet();
        for(int i=0;i<emails.length;i++){
            String email = emails[i];
            String pre = email.split("@")[0];
            System.out.println(pre);
            int index = pre.indexOf("+");
            System.out.println(index);
            
            if((index) > 0){
                pre = pre.substring(0,index);
                System.out.println(pre);
            }
            pre = pre.replaceAll("\\.","");
            System.out.println(pre+email.split("@")[1]);
            set.add(pre+email.split("@")[1]);
            System.out.println("--------------------------------");
        }
        return set.size();
    }
}

    