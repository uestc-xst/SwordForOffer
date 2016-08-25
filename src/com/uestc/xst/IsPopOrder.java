package com.uestc.xst;

import java.util.ArrayList;



public class IsPopOrder {

	/**
	 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
	 * 假设压入栈的所有数字均不相等。
	 * @param pushA
	 * @param popA
	 * @return
	 */
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
    	
    	if (popA==null||pushA==null||popA.length!=pushA.length) {
			return false;
		}
    	
    	ArrayList<Integer> pushList = new ArrayList<>();
    	
    	
    	for(int i=0;i<pushA.length;i++){
    		pushList.add(pushA[i]);
    	}
    	//判断popA和pushA数组是否有不匹配的数字
    	for(int i=0;i<popA.length;i++){
    		if (pushList.indexOf(popA[i])==-1) {
				return false;
			}
    	}
    	//判断理由：当popA[i]后面比它自己小的数字是按照入栈的逆序排列则是正确出栈的，否则不是
    	for(int i=0;i<popA.length-1;i++){
    		int index = pushList.indexOf(popA[i]);
    		for(int j=i+1;j<popA.length;j++){
    			if (pushList.indexOf(popA[i])>pushList.indexOf(popA[j])) {
					int indextemp = pushList.indexOf(popA[j]);
					if (indextemp>index) {
						return false;
					}else{
						index = indextemp;
					}
					
				}
    		}
    	}
		return true;
    	
    }
    
}
