package com.leetcode.problems.problems_200;


/*
 * Excel表列序号
 */
public class Solution171 {

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("B"));
        System.out.println(titleToNumber("AA"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }
    
    /*
    给定一个Excel表格中的列名称，返回其相应的列序号。

例如，
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
            示例 1:
            
            输入: "A"
            输出: 1
            示例 2:
            
            输入: "AB"
            输出: 28
            示例 3:
            
            输入: "ZY"
            输出: 701 
     * 
     */
    
    public static int titleToNumber(String s) {
        int sum =0;
        char[] arr = s.toCharArray(); 
        for(int i=0;i<arr.length;i++) {
            int temp = arr[i]-'A';
            sum = sum + (temp+1)*(int)Math.pow(26, arr.length-i-1);
        }
        return sum;
    }
}

	