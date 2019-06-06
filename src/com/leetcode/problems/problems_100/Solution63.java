package com.leetcode.problems.problems_100;

import java.math.BigDecimal;
import java.util.Arrays;

public class Solution63 {
	 public static void main(String[] args) {
       int[][] a = {
                    {0,0,0},
                    {0,0,0},
                    {0,0,0}
                   };
		 
		 System.out.println("asdfasdf   "+  uniquePathsWithObstacles(a) );    
		 for(int[] b:a) {
			 System.out.println(Arrays.toString(b));
		 }
		 
		 //A(5,5);
	 }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1
    	   || obstacleGrid[0][0] == 1		
    	) {
    		return 0;
    	}
    	int R = obstacleGrid.length;
    	int C = obstacleGrid[0].length;
    	obstacleGrid[0][0] = 1;
    	
    	for(int i=1;i<R;i++) {
    		obstacleGrid[i][0] =  (obstacleGrid[i][0] == 0 &&   obstacleGrid[i-1][0] == 1)?1:0 ;
    	}
    	for(int i=1;i<C;i++) {
    		obstacleGrid[0][i] =  (obstacleGrid[0][i] == 0 &&   obstacleGrid[0][i-1] == 1)?1:0 ;
    	}
    	
    	for(int i=1;i<obstacleGrid.length;i++) {
    		for(int j=1;j<obstacleGrid[i].length;j++) {
    			if(obstacleGrid[i][j] == 0) {
    				obstacleGrid[i][j] =  obstacleGrid[i-1][j] + obstacleGrid[i][j-1] ;
    			}else {
    				obstacleGrid[i][j] = 0;
    			}
    		}
    	}
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
