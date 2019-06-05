package exercise;

import java.util.Arrays;

public class MyExe0604 {
    
    
    // 学习地址   https://www.jianshu.com/p/47170b1ced23
    public static void main(String args[]) {
        int[] arr = {9,8,-4,100,7,6,5,4,3,2,1,0};
     //         mergeSort(arr,0,arr.length-1);
     //       quickSort(arr,0,arr.length-1);
       heapSort(arr);
        
        System.out.println(Arrays.toString(arr));
    }
   
    
    /**
     *    归并排序
     */
    public  static void  mergeSort(int[] a,int start,int end) {
        if(start < end) {
            int mid = start + ((end - start +1)>>2) ;
            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int temp[] = new int[end - start +1];
        int i =start,j=mid+1 ;
        int k = 0;
        while( i<= mid && j<=end ) {
            if(a[i] < a[j]) {
                temp[k++] = a[i++];
            }else {
                temp[k++] = a[j++];
            }
        }
        while(i<= mid) {
            temp[k++] = a[i++];
        }
        while(j<= end) {
            temp[k++] = a[j++];
        }
        for(int x=0;x<temp.length;x++) {
            a[start +x] =temp[x];
        }
    }
    
    public static void quickSort(int[] a,int start,int end) {
        int l = start;
        int h = end;
        int povit  = a[l];
        while(l<h) {
            while(l<h && a[h]>=povit) {
                h--;
            }
            if( l<h ) {
                a[l] = a[h];
                l++;
            }
            while(l<h && a[l]<=povit) {
                l++;
            }
            if( l<h ) {
                a[h] = a[l];
                h--;
            }
        }
        a[l] = povit;
        if(l-1>start) {
            quickSort(a,start,l-1);
        }
        if(l+1<end) {
            quickSort(a,l+1,end);
        }
    }
    
    public  static void heapSort(int a[]) {
            int len = a.length;
            for(int i = (len>>2)+1;i>=0;i--) {
                adjustHeap(a,i,len);
            }
            for(int j=len-1;j>=0;j--) {
                swap(a,j,0);
                adjustHeap(a,0,j);
            }
    }

    private static void swap(int[] a, int j, int i) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    private static void adjustHeap(int[] a, int i, int len) {
        int temp = a[i];
        for(int k=2*i+1;k<len;k = 2*k+1) {
            if(k+1<len && a[k] < a[k+1]) {
                k++;
            }
            if(a[k] > temp ) {
                a[i] = a[k];
                i = k;
            }else {
                break;
            }
        }
        a[i] = temp;	
    }
}

	