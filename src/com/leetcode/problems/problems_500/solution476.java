package com.leetcode.problems.problems_500;


public class solution476 {
    public static void main(String args[]) {
        
        Integer i = (int) 2e31;
        
        int num = 7;
       // System.out.println(Math.pow(0, 0));
        System.out.println(Integer.toBinaryString( Integer.highestOneBit(num)  ) );
        System.out.println(Integer.toBinaryString( Integer.highestOneBit(num) -1  ) );
        System.out.println(Integer.toBinaryString( num & (Integer.highestOneBit(num) - 1)   ) );
        System.out.println(Integer.toBinaryString( ~num & (Integer.highestOneBit(num) - 1)   ) );
        
        System.out.println( num & (Integer.highestOneBit(num) - 1)  );
        
    }
    
    
    public static int findComplement(int num) {
         char[] a = Integer.toBinaryString( num ).toCharArray();
         int sum = 0;
         for(int i=a.length-1;i>=0 ; i--) {
             //System.out.println( (a[i] == '1' ? 0:1 ) *2 + " -------  " +( a.length - i-1 ) );
             //System.out.println( " --- Math.pow( (a[i] == '1' ? 0:1 ) *2, a.length - i-1 ) ---  " +( Math.pow( (a[i] == '1' ? 0:1 ) *2, a.length - i-1 )) );
             if(a.length - i-1 == 0) {
                 sum = sum + (a[i] == '1' ? 0:1 ) *2;
             }else {
                 sum = (int) ( sum + Math.pow( (a[i] == '1' ? 0:1 ) *2, a.length - i-1 ) );
                 
             }
         }
         return sum;
    }
}

	