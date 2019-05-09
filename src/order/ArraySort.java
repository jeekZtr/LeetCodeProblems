package order;

import java.util.Arrays;

import org.junit.Test;

public class ArraySort {
    
    /* 冒泡法排序  
             * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。 
             * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
             * 针对所有的元素重复以上的步骤，除了最后一个。
             * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     *   
     * @param numbers   需要排序的整型数组  
     */  
    public static void bubbleSort(int[] numbers) {   
        for(int i=0;i<numbers.length;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                if(numbers[i]>numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    /* 快速排序 -->优化的冒泡排序 
                * 从数列中挑出一个元素，称为“基准”</li>  
                * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，  
                * 该基准是它的最后位置。这个称为分割（partition）操作。
                * 递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。
    *   
    * @param numbers  
    * @param start  
    * @param end  
    */ 
   public static void quickSort(int[] nums, int start, int end) {   
       int l = start;
       int h = end;
       //System.out.println(Arrays.toString(nums));
       int povit = nums[l];
       while(l<h) {
           System.out.println("========================================");
           while(l<h && nums[h] >= povit) {
               
               h--;
           }
           if(l<h) {
              nums[l] = nums[h]; 
              l++;
           }
           System.out.println("1---"+Arrays.toString(nums));
           while(l<h && nums[l] <= povit ){
               System.out.println("l--"+l+" ,h--"+h);
               l++;
           }
           
           if(l<h) {
               nums[h] = nums[l];
               h--;
           }
           System.out.println("2---"+Arrays.toString(nums));
       }
       nums[l] = povit ;
      
       //System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
       if(l-1>start)quickSort(nums,start,l-1);
       if(h+1<end)quickSort(nums,h+1,end);
   }
    
}

	