package com.uestc.xst;

import java.util.HashMap;

public class CloneRandomListNode {
	
	/**
	 * ��������ĸ���
	 * @param pHead		�����Ƶĸ�������ı�ͷ
	 * @return			���Ƶ�������ı�ͷ
	 * ���ÿռ任ʱ���˼·��ʱ�临�Ӷ���O(n)
	 */
    public static RandomListNode Clone(RandomListNode pHead)
    {
    	
    	if (pHead==null) {
			return null;
		}
    	
    	HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
    	RandomListNode headTemp = pHead;
    	
    	//1. ����ÿ���ڵ� N �ĸ��ƽڵ�N��������ӵ�����<N,N'>
    	while(headTemp!=null){
    		RandomListNode tempnode = new RandomListNode(headTemp.label);
    		map.put(headTemp, tempnode);
    		headTemp = headTemp.next;
    	}
    	
    	//2. ����N�Ĺ�ϵ�����¹���N��
    	headTemp = pHead;
    	while(headTemp!=null){
    		map.get(headTemp).next = map.get(headTemp.next);
    		map.get(headTemp).random = map.get(headTemp.random);
    		headTemp = headTemp.next;
    	}
    	
    	//3. ���ع�����������ı�ͷ
		return map.get(pHead);
        
    }
}
