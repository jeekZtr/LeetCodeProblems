package order;

import java.util.Arrays;

public class ArraySort {


	/*
	 * 快速排序 -->优化的冒泡排序 从数列中挑出一个元素，称为“基准”</li>
	 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，
	 * 该基准是它的最后位置。这个称为分割（partition）操作。 递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。
	 * 
	 * @param numbers
	 * 
	 * @param start
	 * 
	 * @param end
	 */
	public static void quickSort(int[] nums, int start, int end) {
		int l = start;
		int h = end;
		// System.out.println(Arrays.toString(nums));
		int povit = nums[l]; // 数组的第一个作为中轴
		while (l < h) {
			System.out.println("========================================");
			while (l < h && nums[h] >= povit) {

				h--;
			}
			if (l < h) {
				nums[l] = nums[h]; // 比中轴小的记录移到低端
				l++;
			}
			System.out.println("1---" + Arrays.toString(nums));
			while (l < h && nums[l] <= povit) {
				System.out.println("l--" + l + " ,h--" + h);
				l++;
			}

			if (l < h) {
				nums[h] = nums[l]; // 比中轴大的记录移到高端
				h--;
			}
			System.out.println("2---" + Arrays.toString(nums));
		}
		nums[l] = povit; // 中轴记录到尾
		// System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
		if (l - 1 > start)
			quickSort(nums, start, l - 1);
		if (h + 1 < end)
			quickSort(nums, h + 1, end);
	}
	
	
	
    // 学习地址   https://www.jianshu.com/p/47170b1ced23
    public static void main(String args[]) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        ArraySort as = new ArraySort();
//        as.bubbleSort_optimization(arr); // 冒泡排序
//        as.quickSort(arr, 0, arr.length-1); // 快速排序
       
//        as.selectionSort(arr); // 选择排序
//        as.insertionSort(arr); // 简单插入排序
//        as.ShellSort(arr);
//        as.mergeSort(arr); // 归并 排序
        as.heapSort(arr); // 堆排序
        
        System.out.println(Arrays.toString(arr));
    }
    
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
            for(int j=0;j<numbers.length-i-1;j++) {
                if(numbers[j]>numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
    // 算法优化
    // 学习地址   https://www.jianshu.com/p/47170b1ced23
    public static void bubbleSort_optimization(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            //增加判断  数组为空的判断
            return ;
        }
        /*设置标识，判断这趟排序是否发生了交换。
                            如果未发生交换，则说明数组已经有序，不必再排序了*/
        boolean isSwap = false;
        for(int i=0;i<numbers.length;i++) {
            for(int j=0;j<numbers.length-i-1;j++) {
                if(numbers[j]>numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    isSwap = true;
                    System.out.println("---"+Arrays.toString(numbers));
                }
            }
            if(!isSwap) {
                break;
            }
        }
    }
      //这个算法不是冒泡排序, 我也不知道是什么算法  有点类似 选择排序 -->
      //就是选择排序的劣化版, 选择排序中,只把未排序的最小值放在第一位,而我这个只要比当期的第一位小就交换位置.
//    public static void bubbleSort(int[] numbers) {   
//        for(int i=0;i<numbers.length;i++) {
//            for(int j=i+1;j<numbers.length;j++) {
//                if(numbers[i]>numbers[j]) {
//                    int temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//        }
//    }
    /**
     * @author zhngtr-mi
     * @since 2019-05-10
     */
    public static void selectionSort(int[] numbers) {   
        for(int i=0;i<numbers.length;i++) {
            //int min = numbers[i];
            int index = i; //最小元素的索引
            boolean ismin = true;
            for(int j=i+1;j<numbers.length;j++) {
                if(numbers[index]>numbers[j]) {
                    //min = numbers[i];
                    index = j;
                    ismin = false;
                }
            }
            if(!ismin) {
                swap(numbers,i,index);
            }
        }
    }
    /**
     *  insertion sort 直接插入排序
     *   ① 基本思想
                        直接插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
                        ② 算法描述
                        一般来说，直接插入排序都采用in-place（原地算法）在数组上实现。具体算法描述如下：
                        1）从第一个元素开始，该元素可以认为已经被排序；
                        2）取出下一个元素，在已经排序的元素序列中从后向前扫描；
                        3）如果该元素（已排序）大于新元素，将该元素移到下一位置；
                        4）重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
                        5）将新元素插入到该位置后；
                        6）重复步骤2~5。
     * 
     */
    public static void insertionSort(int[] nums) {
        
        for(int i=0;i<nums.length;i++) {
//            int val = nums[i]; 
//            for(int j=i;j>0;j--) {
//                if(nums[j]  < nums[j-1]  ) { //这么做一点也不插入... 成了类似冒泡的排序了. 倒叙冒泡????????
//                    nums[j] = nums[j-1];
//                    nums[j-1] = val;
//                }
//            }
            //做成上面那样还是因为, 对坐标的理解不深
            int current = nums[i];
            int preIndex = i-1;
            while(preIndex >=0 && current < nums[preIndex] ) {
                nums[preIndex+1] =  nums[preIndex]; 
                preIndex--;
            }
            nums[preIndex+1] = current;
        }
    }
    public static int[] insertionSort_web(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for(int i = 1; i < array.length; i++) {
            current = array[i];
            int preIndex = i - 1;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }
    
    /*
     * 希尔 排序 ---> 缩小增量排序
     *  ① 基本思想
            1959年Shell发明，第一个突破O(n2)的排序算法，是直接插入排序的改进版。
            它与直接插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
                    ② 算法描述
                                 先将整个待排元素序列分割成 gap 个增量为 gap 的子序列（每个子序列由位置相差为 gap 的元素组成，整个序列正好分割成 gap 个子序列，每个序列中有 n / gap 个元素）分别进行直接插入排序，然后缩减增量为之前的一半再进行排序，待 gap == 1时，希尔排序就变成了直接插入排序。因为此时序列已经基本有序，直接插入排序在元素基本有序的情况下（接近最好情况），效率是很高的。gap初始值一般取 len / 2。
            
     */
    public static void ShellSort(int[] array) {
        
        int len = array.length;
        int current ,gap = len/2;
        while(gap>0) {
            for(int i=gap;i<len;i++) {
                current = array[i];
                int preIndex = i-gap;
                while(preIndex>=0 && array[preIndex] > current ) {
                    array[preIndex+gap] = array[preIndex];
                    preIndex-=gap;
                }
                array[preIndex+gap] = current;
            }
            gap /= 2;
        }
        
    }
    
    /**
     * 归并排序
     * 归并排序（Merge Sort）
		① 基本思想
		           归并排序是建立在归并操作上的一种有效的排序算法。
		           该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
		           将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。
		           若将两个有序表合并成一个有序表，称为2-路归并。
		② 算法描述
			1）把长度为 n 的输入序列分成两个长度为 n / 2 的子序列；
			2）对这两个子序列分别采用归并排序；
            3）将两个排序好的子序列合并成一个最终的排序序列。

     * @param nums
     */
    public static void mergeSort(int[] nums) {
    	int[] tmpA = new int[nums.length];
    	mSort(nums,tmpA,0,nums.length-1);
    }
    //归并算法的图解  https://blog.csdn.net/jianyuerensheng/article/details/51262984
    public static void mSort(int[] nums,int[] tmpA,int l,int r) {
    	int center;
    	if(l < r) {
    		center = (l + r)/2;
    		mSort(nums,tmpA,l,center);
    		mSort(nums,tmpA,center+1,r);
    		merge(nums,tmpA,l,center+1,r);
    	}
    }
    
    public static void merge(int[] nums,int[] tempArr,int left,int right,int rightEnd){
    	
    	int LeftEnd = right -1;
    	int temp = left; // 存放结果的数组的初始位置
    	int sortNums = rightEnd - left+1;
		while(left <= LeftEnd && right <= rightEnd ) {
			//tempArr[left++] = nums[left];
			if(nums[left] <= nums[right] ) {
				tempArr[temp++] = nums[left++];
			}else {
				tempArr[temp++] = nums[right++];
			}
		}
		while(left <= LeftEnd) {
			tempArr[temp++] = nums[left++];
		}
		while(right <= rightEnd) {
			tempArr[temp++] = nums[right++];
		}
//		System.out.println("---------------");
		// 我写的
//		for(int i=rightEnd;i>=rightEnd-sortNums+1;i--){
//			System.out.println("rightEnd--"+i);
//			nums[i] = tempArr[i];
//		}
		for(int i=0;i<sortNums;i++,rightEnd--){
//			System.out.println("rightEnd--"+rightEnd);
			nums[rightEnd] = tempArr[rightEnd];
		}
    }
    
    /*
     *	 堆排序
     *  	实现思路，
     *  		a，将一个无序的序列构成一个堆，根据升序或降序需求选择大顶堆或小顶堆
     *  		b，将顶元素与末尾元素进行交换，将最大元素“沉”到数组末端
     *  		c，重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换步骤，直到整个数组有序
     * 	 该数组从逻辑上讲就是一个堆结构，我们用简单的公式来描述一下堆的定义就是：
	 *		大顶堆：arr[i] >= arr[2i+1] && arr[i] >= arr[2i+2]  
	 *		小顶堆：arr[i] <= arr[2i+1] && arr[i] <= arr[2i+2]  
     */
   public static void heapSort(int[] nums){
	   //1 , 构建大顶堆。
	   		// 第一个非叶子 子节点，是什么？
	   int len = nums.length;
	   for(int i=len/2-1;i>=0;i--){ // 搞懂为什么第一个非叶子节点是 len/2-1 ;
		   adjustHeap(nums,i,len);
	   }
	   // 调整堆结构 + 交换堆顶元素与末尾元素交换
	   for(int j=len -1;j>0;j--) {
		   swap(nums,0,j);
		   adjustHeap(nums,0,j);
	   }
   } 
    
   /**
    * 	调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
    * @param nums
    * @param i
    * @param len
    */
   private static void adjustHeap(int[] arr, int i, int len) {
		// TODO Auto-generated method stub
		// 让 arr【i】 和 arr【2i+1】 和arr【2i+2】 的  三个数比较。   大的放到前面
	    // 也就是让 父节点和 两个子节点比较位置 ， 然后 大的放到前面               
	   
	    int temp = arr[i]; //记录父节点的，值
	    // 遍历子节点
	    for(int k=2*i+1;k<len;k++){
	    	//
	    	if(k+1 < len && arr[k]<arr[k+1] ) {
	    		k++;
	    	}
	    	
	    	if(arr[k]>temp){
	    		arr[i] = arr[k];
	    		i = k;
	    	}else {
	    		break;
	    	}
	    }
	    arr[i] = temp;
	}



public static void swap(int[] arr,int x,int y) {
       int temp = arr[x];
       arr[x] = arr[y];
       arr[y] = temp;
   }

	

	

	/**
	 * 选择排序算法 在未排序序列中找到最小元素，存放到排序序列的起始位置 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
	 * 以此类推，直到所有元素均排序完毕。
	 * 
	 * 
	 * 和我的想法不同，他是直接求得 最小值的坐标，然后交换两个值。 和是选择排序的定义一致。
	 * @param numbers
	 */
	public static void selectSort_web(int[] numbers) {
		int size = numbers.length; // 数组长度
		int temp = 0; // 中间变量

		for (int i = 0; i < size; i++) {
			int k = i; // 待确定的位置
			// 选择出应该在第i个位置的数
			for (int j = size - 1; j > i; j--) {
				if (numbers[j] < numbers[k]) {
					k = j;
				}
			}
			// 交换两个数
			temp = numbers[i];
			numbers[i] = numbers[k];
			numbers[k] = temp;
		}
	}
	
	 /**  
	 * 插入排序
	 * 
	 * 从第一个元素开始，该元素可以认为已经被排序
	 * 取出下一个元素，在已经排序的元素序列中从后向前扫描 
	 * 如果该元素（已排序）大于新元素，将该元素移到下一位置  
	 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置  
	 * 将新元素插入到该位置中  
	 * 重复步骤2  
	 * @param numbers  待排序数组
	 */  
	public static void insertSort(int[] nums){
		for(int i=0;i<nums.length;i++) {
			int index = i;
			for(int j=i-1 ;j>=0;j--) { // 已排好的数据
				if(nums[j] > nums[index] ) {
					int temp = nums[j];
					nums[j] = nums[index];
					nums[index] = temp;
					index--;
				}
			}
		}
	}
}
