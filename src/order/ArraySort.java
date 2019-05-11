package order;

import java.util.Arrays;

public class ArraySort {
	public static void main(String args[]) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		ArraySort as = new ArraySort();
		// as.bubbleSort(arr);
		// System.out.println(Arrays.toString(arr));
		// as.quickSort(arr, 0, arr.length-1);
		// System.out.println(Arrays.toString(arr));
		//as.selectSort(arr);
		as.insertSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * 冒泡法排序 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。 针对所有的元素重复以上的步骤，除了最后一个。
	 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
	 * 
	 * @param numbers 需要排序的整型数组
	 */
	public static void bubbleSort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

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

	/*
	 * 选择排序算法 在未排序序列中找到最小元素，存放到排序序列的起始位置 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
	 * 以此类推，直到所有元素均排序完毕。
	 * 
	 * @param numbers
	 */
	public static void selectSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];
			int index = -1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < min) {
					min = nums[j];
					index = j;
				}

			}
			if (index != -1) {
				nums[index] = nums[i];
				nums[i] = min;
			}
			System.out.println("2---" + Arrays.toString(nums));
		}
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
