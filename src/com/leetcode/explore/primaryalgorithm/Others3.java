package com.leetcode.explore.primaryalgorithm;

import java.util.Arrays;

public class Others3 {

    /**
     * 颠倒二进制位
     * 
     * 颠倒给定的 32 位无符号整数的二进制位。 示例 1： 输入: 00000010100101000001111010011100 输出:
     * 00111001011110000010100101000000 解释: 输入的二进制串 00000010100101000001111010011100
     * 表示无符号整数 43261596， 因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
     * 示例 2：
     *  输入：11111111111111111111111111111101 
     *  输出：10111111111111111111111111111111
     *  解释：
     *      输入的二进制串 11111111111111111111111111111101 表示无符号整数 4294967293，
     *      因此返回 3221225471 其二进制表示形式为 10101111110010110010011101101001。
     * 
     * 提示： 请注意，在某些语言（如
     * Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
     * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 2 中，输入表示有符号整数 -3，输出表示有符号整数
     * -1073741825。
     */
    public static int reverseBits(int n) {
        int[] num = new int[32]; // num[0]表示几位符号为, num[1] 为 2的31次方 依次类推
        long res = 0;
        for (int i = 0; i < 32; i++) {
            num[i] = n & 1;
            res = (long) (res + (n & 1) * Math.pow(2, (31 - i)));
            n = n >> 1;
        }
        return (int)res;
    }
    
    public static int reverseBits_1(int n) {
        int[] re = new int[32];
        int flag = 1;
        int index = 31;
        //如果用int可能存在溢出问题
        long result = 0;
        while (flag != 0) {
            if ((flag & n) != 0) {
                re[index] = 1;
            }
            flag = flag << 1;
            index--;
        }
        for (int i = 31; i >= 0; i--) {
            result += re[i]*Math.pow(2,i);
            System.out.print(re[i]);
        }
        System.out.println();
        return (int)result;
    }

    public static void main(String args[]) {
        System.out.println(reverseBits(-3));
        
    }
}
