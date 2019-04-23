package com.leetcode.explore.primaryalgorithm;

import java.util.Stack;

public class Design2 {
/**
	 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
	
	    push(x) -- 将元素 x 推入栈中。
	    pop() -- 删除栈顶的元素。
	    top() -- 获取栈顶元素。
	    getMin() -- 检索栈中的最小元素。
	
	示例:
	
	MinStack minStack = new MinStack();
	minStack.push(-2);
	minStack.push(0);
	minStack.push(-3);
	minStack.getMin();   --> 返回 -3.
	minStack.pop();
	minStack.top();      --> 返回 0.
	minStack.getMin();   --> 返回 -2.



 * @param args
 */
	private static Stack<Integer> s;
	private static int min;
	public static void main(String[] args) {
		int[] nums = {1,2,3};
	}
	/** initialize your data structure here. */
    public Design2() {
    	this.s  = new Stack<Integer>();
    }
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    public void push(int x) {
        if(s.isEmpty()) {
        	s.push(0);
        	min = x;
        }else {
        	s.push(x-min);
        	if(min>x) {
        		min = x;
        	}
        }
    	
    }
    
    public void pop() {
    	 int val = s.pop();
         if(val > 0) {
         }else {
         	min = min-val;
         }
    }
    
    public int top() {
        int val = s.peek();
        if(val > 0) {
        	return val+min;
        }else {
        	min = min-val;
        	return min;
        }
    }
    
    public int getMin() {
        return min;
    }
}
