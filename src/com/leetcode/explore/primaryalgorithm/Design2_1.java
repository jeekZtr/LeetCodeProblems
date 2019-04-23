package com.leetcode.explore.primaryalgorithm;

import java.util.Stack;

public class Design2_1 {
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
	private static Stack<Integer> min;
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		Design2_1 d = new Design2_1();
		d.push(2);
		d.push(0);
		d.push(3);
		d.push(0);
		System.out.println(d.getMin());
		d.pop(); // 弹出 0 
		System.out.println(d.getMin());
		d.pop(); // 弹出 3
		System.out.println(d.getMin());
		d.pop(); // 弹出 0
		System.out.println(d.getMin());
		
	}
    
    /** initialize your data structure here. */
    public Design2_1() {
        this.s  = new Stack<Integer>();
        this.min = new Stack<Integer>();
    }
  
    public void push(int x) {
    	s.push(x);
    	if(min.empty() ||min.peek() >= x ) {
    		min.push(x);
    	}
    }
    
    public void pop() {
    	//System.out.println(min.peek());
         if(s.peek() - min.peek()==0 ) {
        	 min.pop();
         }
         s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
