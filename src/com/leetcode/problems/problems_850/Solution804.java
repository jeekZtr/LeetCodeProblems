package com.leetcode.problems.problems_850;

import java.util.HashSet;
import java.util.Set;

/**
 * 唯一摩尔斯密码词
 * 
 * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。

        为了方便，所有26个英文字母对应摩尔斯密码表如下：
        
        [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。

        返回我们可以获得所有词不同单词翻译的数量。
        
        例如:
        输入: words = ["gin", "zen", "gig", "msg"]
        输出: 2
        解释: 
        各单词翻译如下:
        "gin" -> "--...-."
        "zen" -> "--...-."
        "gig" -> "--...--."
        "msg" -> "--...--."
        
        共有 2 种不同翻译, "--...-." 和 "--...--.".
 * 
 * ClassName: Solution804 <br/>
 * date: 2019年5月5日 下午1:43:42 <br/>
 *
 * @author zhngtr-mi
 */
public class Solution804 {
    
    public static void main(String args[]) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));;
        
    }
    
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
        
        Set res = new HashSet();
        for(int i=0;i<words.length;i++) {
            StringBuffer sb = new StringBuffer();
            String word = words[i];
            for(int j=0;j<word.length();j++) {
                sb.append(morse[word.charAt(j)-97]);
            }
            res.add(sb.toString());
            System.out.println(sb.toString());
        }
        
        return res.size();
    }
}

	