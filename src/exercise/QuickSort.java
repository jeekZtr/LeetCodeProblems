
package exercise;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {1,10,123,2,4,1,3,3,3,4,5,3,4,5,4,8,8,9,9};
        quickSort(nums,0,nums.length-3);
        System.out.println(Arrays.toString(nums));
    }
    
    public static void quickSort(int[] nums,int start,int end) {
        int l = start;
        int r = end;
        int provix = nums[l];
        while(l < r) {
            // 从后往前找到第一个 比 标准小的值
            while(l < r && nums[r] >= provix ) {
                r--;
            }
            // 把 这个小的值 放入的坐标的 左边
            if(l < r ) {
                nums[l] = nums[r];
                l++; //  移动 左边的坐标
            }
            // 此时 r的左边的值 被放入的左边.. 在该位置的 r值是无效
            
            // 找到 左边第一个比 坐标大的  位置
            while(l < r && nums[l] <= provix ) {
                l++;
            }
            // 左边找到比 基准大的值, 放入到 基准的右边 ;; 替换无效的r坐标的值
            if( l < r) {
                nums[r] = nums[l]; 
            }
            // 此时的 坐标的l上的值 无效的 ,已经如给r了
        }
        nums[l] = provix;
        // 一个 while循环结束, 已坐标的provix 的值,为基准的 左边 和右边 排序 完成
        
        // 这时的   以基准为例 , 左边全是小于右边的,  但是在左边里面,还是无序的
        // 需要需要继续对无序的进行排序
        // 然后继续 排序的  坐标的左边和 右边
        if(l-1 > start) {
            quickSort(nums , start ,l-1);
        } 
        if(r+1 < end ) {
            quickSort(nums , r+1 ,end);
        }
    }
}

	