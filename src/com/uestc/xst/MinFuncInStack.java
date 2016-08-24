package com.uestc.xst;

import java.util.Stack;


/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
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
