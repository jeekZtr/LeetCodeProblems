package com.leetcode.problems.problems_5;

import java.util.ArrayList;

/**
 * 
          ����һ���ַ��� s���ҵ� s ����Ļ����Ӵ�������Լ��� s ����󳤶�Ϊ 1000��

	ʾ�� 1��   
	
	����: "babad"
	���: "bab"
	ע��: "aba" Ҳ��һ����Ч�𰸡�
	
	ʾ�� 2��
	
	����: "cbbd"
	���: "bb"
 * 
 * @author zhang
 *
 */
public class Solution {
	 public static void main(String args[]) {
		 long l = System.currentTimeMillis();
		 System.out.println("123123123------------"+longestPalindrome("ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy"));
//		 System.out.println(panduanshifouhuiwen(0, 4, "babad"));
		 System.out.println(( System.currentTimeMillis() -  l ));
	 }
	
	 public static String longestPalindrome(String s) {
		 int chadu = 0;
		 String c_str = "";
		 if( "".equals(s) || s.length() == 1 ) {
			 return s;
		 }
		 for(int i=0;i<s.length();i++) {
			for(int j= i+1;j<s.length(); j++) {
				String str = panduanshifouhuiwen(i,j,s);
//				System.out.println("str--"+str);
				if(str != null && str.length() > chadu ){
					chadu = str.length();
					c_str = str;
				}
			} 
		 }
		 if("".equals(c_str)) {
			 return s.charAt(0) +"";
		 }
	     return c_str;
	 }

	private static String panduanshifouhuiwen(int start, int end, String s) {
		ArrayList isp = new ArrayList();
		String sub_s = s.substring(start,end+1) ;
		int i = 0;
		int j = sub_s.length()-1;
		
		int x = 0;
		if(j%2 == 0) {
			x = j/2 ;
		}else {
			x= j/2+1;
		}
//		System.out.println("=============================");
//		System.out.println("start--"+start+" ,end--"+end);
//		System.out.println("sub_s--"+sub_s);
		while(i < x && i <= j-i) {	
			if(sub_s.charAt(i)  == sub_s.charAt(j-i)) {
				//isp = false;
				isp.add("0");
//				System.out.println("----00000000000");
			}else {
				isp.add("1");
//				System.out.println("----11111111111");
			}
			i++;
		}
		if(isp.contains("1")) {
			return null;
		}else {
			return sub_s;
		}
	}
}
