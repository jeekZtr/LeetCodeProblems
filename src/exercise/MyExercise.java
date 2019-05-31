package exercise;

import java.util.Arrays;

import order.ArraySort;

public class MyExercise {
    
    // 学习地址   https://www.jianshu.com/p/47170b1ced23
    public static void main(String args[]) {
        int[] arr = {9,8,-4,100,7,6,5,4,3,2,1,0};
        MyExercise.mergeSort(arr, 0, arr.length-1);
        //MyExercise.quickSort_exe1(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
   
    
    /**
     * 快速排序
     * 
     */
    public static void quickSort_exe1(int[] a, int start ,int end) {
        int provix = a[start];
        int l = start;
        int h = end;
        // 根据 provix 进行比较, 大的放入到右边 , 小的放入到左边
        while( l<h ) {
            while(l<h && a[h] >= provix ) {
                h--;
            }
            if(l<h) {
                a[l] = a[h];
            }
            while(l<h && a[l] <= provix ) {
                l++;
            }
            if(l<h) {
                a[h] = a[l];
            }
        }
        a[l] = provix;
        
        // 比较剩余的 左边和右边
        if(l-1 >start) {
            quickSort_exe1(a,start,l-1);
        }
        if(h+1 < end) {
            quickSort_exe1(a,h+1,end);
        }
    }
    
    /**
     * 归并排序
     */
    public static void mergeSort(int[] a,int start,int end) {
        int l =start;
        int h = end;
        if(start<end) {
            int mid = start+(end - start)/2;
            mergeSort(a , l,mid);
            mergeSort(a , mid+1,h);
            merge(a,l,mid,h);
        }
        
    }
    private static void merge(int[] a, int start,int mid ,int end) {
        int temp[] = new int[end-start+1];
        int i=start , j=mid+1 , k=0 ;
        while(i<=mid && j<=end) {
            if(a[i] < a[j] ) {
                temp[k++] = a[i++];
            }else {
                temp[k++] = a[j++];
            }
        }
        while(i<=mid) {
            temp[k++] = a[i++];
        }
        while(j<=end) {
            temp[k++] = a[j++];
        }
        for(int x=0;x<temp.length;x++) {
            a[x+start] = temp[x];
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    /**
     * 
                 * 快速排序
     */
    public static  void  quickSort(int[] nums,int start,int end) {
        
        if(nums == null || nums.length<=1) {
            return ;
        }
        
        int l = start;
        int r = end;
        int mid = l+(r-l)/2;
        int provix = nums[l];
        
        while(l<r) {
            
            // 先从 尾部开始找到 第一个比 provix 小的值 , 然后和 l的值进行交换 
            while( l<r && nums[r] >= provix ) {
                r--;
            }
            if( l<r ) {
                nums[l] = nums[r];
                l++;
            }
            
            // 先从 头部开始找到 第一个比 provix 大的值 , 然后和  r 的值进行交换 
            while( l<r && nums[r] < provix) {
                l++;
            }
            if( l<r ) {
                nums[r] = nums[l];
                r--;
            }
        }
        nums[l] = provix;
        if(l-1 > start) {
            quickSort(nums,start,l-1);
        }
        if(l+1 < end) {
            quickSort(nums,l+1,end);
        }
        
    }
    
    
}

	