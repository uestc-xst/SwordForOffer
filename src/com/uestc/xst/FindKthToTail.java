package com.uestc.xst;

public class FindKthToTail {
	
	/**
	 * 输入一个链表，输出链表倒数第K个对象
	 * 解题思路：从头节点开始遍历，每次到达一个新的节点向下计算当前节点是不是倒数第K个节点，如果是，输出节点，如果不是，移动到下一个节点，直到遍历完链表
	 * @param head	输入链表的头节点
	 * @param k		
	 * @return
	 */
    public static ListNode FindKthToTail(ListNode head,int k) {
    	
    	ListNode curNode = head;

    	while(curNode!=null){
    		int cnt = 1;
    		ListNode nextNode = curNode.next;
    		while(nextNode!=null){
    			cnt++;
    			nextNode = nextNode.next;
    		}
    		if (cnt==k) {
				return curNode;
			}
    		curNode = curNode.next;
    	}
		return null;
    }
}
