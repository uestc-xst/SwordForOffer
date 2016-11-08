package com.uestc.xst;

import java.util.HashMap;

public class CloneRandomListNode {
	
	/**
	 * 复杂链表的复制
	 * @param pHead		待复制的复杂链表的表头
	 * @return			复制的新链表的表头
	 * 采用空间换时间的思路，时间复杂度是O(n)
	 */
    public static RandomListNode Clone(RandomListNode pHead)
    {
    	
    	if (pHead==null) {
			return null;
		}
    	
    	HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
    	RandomListNode headTemp = pHead;
    	
    	//1. 创建每个节点 N 的复制节点N‘，并添加到集合<N,N'>
    	while(headTemp!=null){
    		RandomListNode tempnode = new RandomListNode(headTemp.label);
    		map.put(headTemp, tempnode);
    		headTemp = headTemp.next;
    	}
    	
    	//2. 根据N的关系，重新构建N’
    	headTemp = pHead;
    	while(headTemp!=null){
    		map.get(headTemp).next = map.get(headTemp.next);
    		map.get(headTemp).random = map.get(headTemp.random);
    		headTemp = headTemp.next;
    	}
    	
    	//3. 返回构建的新链表的表头
		return map.get(pHead);
        
    }
}
