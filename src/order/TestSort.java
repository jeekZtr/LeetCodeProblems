package order;

import java.util.Arrays;

public class TestSort {
    
    public static void main(String args[]) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        ArraySort as = new ArraySort();
        //as.bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
        //as.quickSort(arr, 0, arr.length-1);
        //System.out.println(Arrays.toString(arr));
        as.selectSort(arr);
        
        System.out.println(Arrays.toString(arr));
    }
}

	