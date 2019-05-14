package com.leetcode.problems.problems1000;


/*
 车的可用捕获量

在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。
它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。

车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），
然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。
另外，车不能与其他友方（白色）象进入同一个方格。

返回车能够在一次移动中捕获到的卒的数量。
 
 */
public class Solution999 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
    /*
     * board.length == board[i].length == 8
       board[i][j] 可以是 'R'，'.'，'B' 或 'p'
               只有一个格子上存在 board[i][j] == 'R'
               
               R 车
               B 象
                                          .  空白
               p 足
               
     */
    public int numRookCaptures(char[][] board) {
       int  sum = 0;
       int  x=0,y=0;
       for(int i=0;i<8;i++) {
           for(int j=0;j<8;j++) {
               if('R' == board[i][j]) {
                   x = i;
                   y = j; 
               }
           }
       }
       // 然后需要遍历 x y 节点的 上下左右 
       // x 的前方
       for(int i=x;i>=0;i--) {
           if( board[i][y] =='B' ) {
               break;
           }
           if( board[i][y] =='p' ) {
               sum ++;
           }
       }
       //x 的后方
       for(int i=x;i<8;i++) {
           if( board[i][y] =='B' ) {
               break;
           }
           if(board[i][y] =='p' ) {
               sum ++;
           }
       }
       //y 的前方
       for(int i=y;i>=0;i--) {
           if( board[x][i] =='B' ) {
               break;
           }
           if( board[x][i] =='p' ) {
               sum ++;
           }
       }
       //y 的后方
       for(int i=y;i<8;i++) {
           if( board[x][i] =='B' ) {
               break;
           }
           if( board[x][i] =='p' ) {
               sum ++;
           }
       }
       return sum;
    }
}

	