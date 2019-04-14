package com.leetcode.problems.problems_850;

/**
 * 
      柠檬水问题
 * 
 * @author zhang
 *
 */
public class Solution860 {
    public  static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        System.out.println(lemonadeChange(a));
    }
    
    public static boolean lemonadeChange(int[] bills) {
        int[] lq = new int[3];
        boolean flag = true;
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5){
                lq[0] = lq[0] + 1 ;
                continue;
            }else if(bills[i] ==  10){
                lq[1] = lq[1] + 1 ;
                if( lq[0] >= 1){
                    lq[0] = lq[0] -1 ;
                    continue;
                }else{
                    return false;
                }
            }else if(bills[i] ==  20){
                lq[2] = lq[2] + 1 ;
                if( lq[0] >= 1 && lq[1] >=1){
                    lq[0] = lq[0] -1 ;
                    lq[1] = lq[1] -1 ;
                    continue;
                }else if(lq[0] >= 3){
                    lq[0] = lq[0] -3 ;
                    continue;
                }else {
                    return false;
                }
            }
        }
        return flag;
    }
}
