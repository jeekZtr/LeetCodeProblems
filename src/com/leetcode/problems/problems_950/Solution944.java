
package com.leetcode.problems.problems_950;



public class Solution944 {

    public static void main(String[] args) {
        String[] a = {  "tsr" ,"wvu"};
        System.out.println(minDeletionSize(a));
    }
    /**
     * 
    *   删列造序
   
       给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。

                选取一个删除索引序列，对于 A 中的每个字符串，删除对应每个索引处的字符。 所余下的字符串行从上往下读形成列。
                
                比如，有 A = ["abcdef", "uvwxyz"]，删除索引序列 {0, 2, 3}，删除后 A 为["bef", "vyz"]， A 的列分别为["b","v"], ["e","y"], ["f","z"]。（形式上，第 n 列为 [A[0][n], A[1][n], ..., A[A.length-1][n]]）。
                
                假设，我们选择了一组删除索引 D，那么在执行删除操作之后，A 中所剩余的每一列都必须是 非降序 排列的，然后请你返回 D.length 的最小可能值。
                
                示例 1：
                
                输入：["cba", "daf", "ghi"]
                输出：1
                解释：
                当选择 D = {1}，删除后 A 的列为：["c","d","g"] 和 ["a","f","i"]，均为非降序排列。
                若选择 D = {}，那么 A 的列 ["b","a","h"] 就不是非降序排列了。
                示例 2：
                
                输入：["a", "b"]
                输出：0
                解释：D = {}
                示例 3：
                
                输入：["zyx", "wvu", "tsr"]
                输出：3
                解释：D = {0, 1, 2}
                提示：
                
                1 <= A.length <= 100
                1 <= A[i].length <= 1000
    *
    * @author zhngtr-mi
    * @since 2019-05-08
     */
    public static int minDeletionSize(String[] A) {
        int count=0;
        String first = A[0];
//        for(int i=0;i<A.length-1;i++) {
//            String n = A[i];
//            String n1 = A[i];
//            for(int j=0;j<first.length();i++) {
//                if(n.charAt(j)>n1.charAt(j)) {
//                    count --;
//                }
//            }
//        }
       int x = first.length()-1; // 代表需要判断几个字符 
       while(x>=0) {
          int y = A.length-1;
          System.out.println("y--"+y+"x--"+x);
          while( y>=1 ) {
              // 倒数第二个字符的 第X个字符比 倒数一个字符的X字符大, 该列需要删除. 最小删除数量加1
              System.out.println("A[y] "+A[y-1].charAt(x)+" y-1 "+A[y].charAt(x));
              if ( A[y-1].charAt(x) - A[y].charAt(x) >0) {
                  count++;
                  System.out.println("count--"+count);
                  break;
              }
              y--; //代表一个列的字符被判断了
          }
          x--; 
       }
       return count;
    }
}

	