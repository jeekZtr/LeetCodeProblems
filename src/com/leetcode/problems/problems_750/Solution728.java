package com.leetcode.problems.problems_750;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution728 {
    public static void main(String args[]) {
        List ls = selfDividingNumbers(1,22);
        System.out.println(Arrays.toString(ls.toArray() ));
    }
    
    
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<Integer>();
        while(left <=right){
            int temp = left;
            Boolean flag = true;
            while( temp > 0 ){
                 if( temp%10 == 0 || left%(temp%10) != 0 ){
                     flag = false;
                 } 
                 temp = temp/10;
            }
            if(flag){
                ls.add(left);
            }
            left++;
        }
        return ls;
    }
}

	