
package com.leetcode.problems.problems1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 
  给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
  
  例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。


  你可以按任意顺序返回答案。
  
   示例 1：
    输入：["bella","label","roller"]
    输出：["e","l","l"]
     示例 2：

    输入：["cool","lock","cook"]
    输出：["c","o"]

    提示：
    1 <= A.length <= 100
    1 <= A[i].length <= 100
    A[i][j] 是小写字母
 */
public class Solution1002 {

    public static void main(String[] args) {
        //String[] str = {"bella","label","roller"};
        String[] str = {"cool","lock","cook"};
        System.out.println(Arrays.toString(commonChars(str).toArray()));
    }
    /*
                        没有考虑的情况
         第一次没有  考虑到    所有单词中的 重复 字符的数量问题
         一个单词中的 的重复字符和 数组的长度 相同....
         修改了 代码 后, 又把   其他里面有重复, 而 其中 某一个没有重复的情况 漏掉了,,         例  {"cool","lock","cook"} , 我的答案是 c ,  正确的c,o
       
     */
    public static List<String> commonChars(String[] A) {
        List<String> ls = new ArrayList();
        int[][] hash = new int[A.length][26];
        for(int i=0;i<A.length;i++) {
            char[] aChar = A[i].toCharArray();
            for(int j=0;j<aChar.length;j++) {
                hash[i][aChar[j]-'a'] +=1; 
            }
        }
        for(int i=0;i<26;i++) {
            int num = hash[0][i] ; // 这个字母在  这个单词中数量
            if(num == 0) continue;
            boolean flag = true;
            for(int j=1;j< A.length ;j++) {
                if(hash[j][i] ==0){
                    flag = false;
                }
                if( num > hash[j][i] ) {
                    num = hash[j][i];
                }
            }
            if(flag) {
                for(int j=0;j<num;j++) {
                    ls.add(  ((char)(i+'a')) +"");
                }
            }
        }
        return ls;
    }
    
    
    public List<String> commonChars_4ms(String[] A) {
        List<String> res = new ArrayList<>();
        int[] count = new int[26], temp = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for(String s : A) {
            Arrays.fill(temp, 0);
            for(char ch : s.toCharArray()) {
                temp[ch - 'a']++;
            }
            
            for(int i = 0; i < 26; i++) {
                count[i] = Math.min(temp[i], count[i]);
            }
        }
        
        for(int i = 0; i < 26; i++) {
            if(count[i] > 0) {
                for(int j = 0; j < count[i]; j++) {
                    res.add("" + (char) ('a' + i));
                }
            }
        }
        
        return res;
    }
}

	