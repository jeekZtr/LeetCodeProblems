package com.leetcode.problems.problems_700;

public class Solution657 {
    public static boolean judgeCircle(String moves) {
        if(moves == null || "".equals(moves)) {
            return true;
        }
        char[] move = {'R','L','U','D'};
        int [] step = {0,0,0,0};
        char[] m = moves.toCharArray();
        for(int i=0;i<m.length;i++) {
            for(int j=0;j<4;j++) {
                if(m[i] == move[j]) {
                    step[j]++;
                }
            }
        }
        if(step[0]==step[1] && step[2] == step[3]) {
            return true;
        }
        return false;
    }
}

	