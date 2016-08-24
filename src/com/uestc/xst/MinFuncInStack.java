package com.uestc.xst;

import java.util.Stack;


/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * @author xst
 *
 */
public class MinFuncInStack {

	public static Stack<Integer> stack = new Stack<>();
	
	
    public void push(int node) {
    	stack.push(node);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
    	
    	int minval = stack.peek();
    	Stack<Integer> tempstack = new Stack<>();
    	int len = stack.size();
    	for(int i=0;i<len;i++){
    		
    		int tempval = stack.pop();
    		tempstack.push(tempval);
    		
    		if (minval>tempval) {
				minval = tempval;
			}
    	}
    	
    	for(int i=0;i<len;i++){
    		stack.push(tempstack.pop());
    	}
        return minval;
    }
    
}
