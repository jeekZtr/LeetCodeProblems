package com.leetcode.problems.problems_1;

import java.util.HashMap;
import java.util.Map;

/**
     * 整数转罗马数字
*
* @author zhngtr-mi
 */
public class Solution12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(61));
    }
    /**
             * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。

        字符          数值
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
        
        通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
        
        I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
        X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
        C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
        给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
        
        示例 1:
        
        输入: 3
        输出: "III"
        示例 2:
        
        输入: 4
        输出: "IV"
        示例 3:
        
        输入: 9
        输出: "IX"
        示例 4:
        
        输入: 58
        输出: "LVIII"
        解释: L = 50, V = 5, III = 3.
        示例 5:
        
        输入: 1994
        输出: "MCMXCIV"
        解释: M = 1000, CM = 900, XC = 90, IV = 4.
     * 
     */
    public static String  intToRoman(int num) {
        String sb = "";
        Map<Integer ,String> map = new HashMap<Integer ,String>();
        map.put( 1, "I");
        map.put( 5, "V");
        map.put( 10, "X");
        map.put( 50, "L");
        map.put( 100, "C");
        map.put( 500, "D");
        map.put( 1000, "M");

        map.put( 4, "IV");
        map.put( 9, "IX");
        map.put( 40, "XL");
        map.put( 90, "XC");
        map.put( 400, "CD");
        map.put( 900, "CM");
        
        int carry = 1;
        while(num > 0) {
            int val = num%10;
            if( val == 4 || val==9 || val == 1 || val == 5) {
                String n =  map.get(val*carry); // 可以直接 查询到的值
                sb =   sb + n; 
            }else {
                if(val < 4 ) {
                    int i=0;
                    while(i<val) {
                        //sb.append( map.get(val*carry) ); // 根据进位 查询到 用到的字符
                        sb =   map.get(1*carry) + sb;
                        i++;
                    }
                }
                if( 5<val && val<9) {
                    int i=0;
                    //sb.append(map.get((5)*carry));
                    String temp =   map.get((5)*carry);
                    while(i<val-5) {
//                        sb.append( map.get((val-5)*carry) ); // 根据进位 查询到 用到的字符
                        temp =    temp + map.get(1*carry);
                        i++;
                    }
                    sb = temp + sb;
                }
            }
            carry = carry*10;
            num /=10;
        }
        
        return sb;
    }
    
    public String intToRoman_22ms(int num) {
        int number[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String numberStr[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer str = new StringBuffer();
        for(int i=0; i < number.length; i++) {
            //循环判断，如果相减的数还是大于当前值，继续运算
            while(number[i] <= num ) {
                num -= number[i];
                str.append(numberStr[i]);
            }
            if(num <= 0) {
                break;
            }
        }
        return str.toString();
    }
    
}

	