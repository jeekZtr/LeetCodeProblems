package exercise;

import java.util.Arrays;

/**
     *       堆排序 
     *  归并排序
     * 快速排序
* @author zhngtr-mi
 */
public class MyExe0603 {
    // 学习地址   https://www.jianshu.com/p/47170b1ced23
    public static void main(String args[]) {
        int[] a = {9,8,-4,100,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(a));
        //heapSort(arr);
        //quickSort(a,0,a.length-1);
        mergeSort(a,0,a.length-1);
//        MyExercise.mergeSort(arr, 0, arr.length-1);
//        //MyExercise.quickSort_exe1(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(a));
    }
    public  static void heapSort(int[] a) {
        
        int len = a.length;
        // 生成大顶堆
        for(int i=len/2-1;i>=0;i--) {
            adjustHeap(a,i,len);
        }
        // 把最大值放入到最后, 把剩余的部分,继续调整成 大顶堆
        for(int j=len-1;j>=0;j--) {
            swap(a,j,0);
            adjustHeap(a,0,j);
        }
    }
    private static void swap(int[] a, int j, int i) {
        System.out.println("swap");
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
    // 调整 大顶堆
    private static void adjustHeap(int[] a, int i, int len) {
        System.out.println("adjustHeap");
        int temp = a[i] ; // 根节点的值
        for(int k= 2*i+1 ; k<len ;k = 2*k+1) {
            //找到 根节点两子节点中较大的子节点
            if(k+1<len && a[k] < a[k+1] ) {
                k++;
            }
            // 然后比较较大的 子节点和 根节点的值比较 , 如果 子节点较大需要交换
            if( a[k] > temp) {
                a[i] = a[k];
                i=k; // 如果交换了位置, 需要记录 根节点值得坐标
            }else {
                // 如果根节点大比两个子节点大 ,那么这个就不用比较了
                break;
            }
        }
        // 如果交换了 , 需要把值放入到 i 位置上,  如果为交换 ,那么没有影响
        a[i] = temp;
        
    }
    /**
     * 快速排序
     */
    public  static  void  quickSort(int[] a, int start,int end ) {
        int l =start;
        int h = end;
        int pivot = a[l];
        while(l<h) {
            while(l<h && a[h] >= pivot) {
                h--;
            }
            if(l< h) {
                a[l] = a[h];
                l++;
            }
            while(l<h && a[l] <= pivot) {
                l++;
            }
            if(l<h) {
                a[h] = a[l];
                h--;
            }
        }
        a[l] = pivot;
        if(l-1>start) {
            quickSort(a,start,l-1);
        }
        if(l+1<end) {
            quickSort(a,l+1,end);
        }
    }
    
    public  static void mergeSort(int[] a,int start,int end ) {
        if(start<end) {
            int mid = start+(end-start)/2;
            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }
    
    private static void merge(int[] a, int start, int mid, int end) {
         int[] temp = new int[end-start+1];
         int i = start;
         int j = mid+1;
         int k = 0;
         while(i<=mid && j<=end) {
             if(a[i]<a[j]) {
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
             a[x+start] =temp[x];
         }
    }
    
}

	