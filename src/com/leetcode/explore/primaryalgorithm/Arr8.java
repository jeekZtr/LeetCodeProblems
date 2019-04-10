package com.leetcode.explore.primaryalgorithm;

public class Arr8 {
	/*
	 * 	����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
	 */
	public static void main(String args[]) {
		int[] a = { 0,0,3,0,0,5,1,0};
		moveZeroes_2ms(a);
		for(int c:a) {
			System.out.print(c+",");
		}
		//System.out.println( plusOne(a));
	}
	
	public static void moveZeroes_2ms(int[] nums) {
		//��¼��oԪ�ؿ�ʼλ��
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        while(k < nums.length) {
            nums[k] = 0;
            k++;
        }
	}
	public static void moveZeroes(int[] nums) {
		int count = 0;
        for(int i=0;i<nums.length-count;i++) {
        	System.out.println("==================================");
        	System.out.println("i--"+i);
        	if(nums[i] == 0) {
        		count +=1;
        	}else {
        		nums[i] = nums[i+count];
        	}
        	System.out.println("i--"+i+",count--"+count);
        	for(int j=i+count;j<nums.length;j++) {
        		System.out.println("i--"+i+",j--"+j);
				if(nums[j] !=0 ) {
					nums[i] = nums[j];
					break;
				}
				System.out.println("i--"+i+",j--"+j+",count--"+count);
        	}
        	System.out.println("---------------");
        }
        int j = 1;
        while(j <= count ) {
        	nums[nums.length-j] = 0;
        	j++;
        }
    }
}
