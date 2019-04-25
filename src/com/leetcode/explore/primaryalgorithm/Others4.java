package com.leetcode.explore.primaryalgorithm;

import java.util.ArrayList;
import java.util.List;

public class Others4 {
    
    /**
                 * 帕斯卡三角形
            
            给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
            
            在杨辉三角中，每个数是它左上方和右上方的数的和。
            
            示例:
            
            输入: 5
            输出:
            [
                 [1],
                [1,1],
               [1,2,1],
              [1,3,3,1],
             [1,4,6,4,1]
            ]
    *
    * @author zhngtr-mi
    * @since 2019-04-25
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList();
        if(numRows>0) {
            List<Integer> li = new ArrayList(); 
            li.add(1);
            list.add(li);
            for(int i=2;i<=numRows;i++) {
                List<Integer> l2 = new ArrayList(); 
                if(i==2) {
                    l2.add(1);
                    l2.add(1);
                }else {
                    List<Integer> l3 = list.get(i-2); 
                    for(int j=0;j<i;j++) {
                        if(j==0) {
                            l2.add(1);
                        }else if(j==i-1) {
                            l2.add(1);
                        }else {
                            int sum = l3.get(j-1) + l3.get(j);
                            l2.add(sum);
                        }
                    }
                }
                list.add(l2);
            }
        }
        
        return list;
    }
	public static void main(String args[]) {
	    List<List<Integer>> list = generate(10);
	    for(int i=0;i<list.size();i++) {
	        List<Integer> l1 = list.get(i);
	        for(int j=0;j<l1.size();j++) {
	            System.out.print(l1.get(j));
	            System.out.print("   ");
	        }
	        System.out.println();
	    }
	    
	}
}
