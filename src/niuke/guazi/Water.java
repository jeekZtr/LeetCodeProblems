
package niuke.guazi;

import java.util.Stack;

public class Water {
    /**
     * 
     * 给定n个柱面的高度，表示降雨某地n块区域的海拔高度。 计算降雨之后该地最大储水面积。如果低于地平线，也就是小于0，则一定积水。
     *
     * @author zhngtr-mi
     * @since 2019-08-21
    */
    public static void main(String[] args) {
    }
    //单调栈   单调栈 leetcode 42题
    public int maxArea(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(int i = 0 ;i < heights.length ; i ++){
            while(!stack.isEmpty() && heights[stack.peek()] <= heights[i]){
                int curIndex = stack.pop();
                if(stack.isEmpty()) break;
                int rigthIndex = i;
                int leftIndex = stack.peek();
                int d = rigthIndex - leftIndex -1;
                int h = Math.min(heights[rigthIndex],heights[leftIndex]) - heights[curIndex];
                result += d*h;
            }
            stack.push(i);
        }
          
        return result;
    }
}

	