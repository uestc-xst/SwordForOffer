package com.uestc.xst;

public class ReverseList {

	
	/**
	 * 翻转链表，输入一个链表，输出链表的翻转链表
	 * @param head
	 * @return
	 */
    public static ListNode ReverseList(ListNode head) {
    	
    	if (head==null) {
			return null;
		}
    	
    	ListNode headnode = head;
    	ListNode tailnode = head;
    	ListNode tempnode = head;
    	
    	while (tailnode.next!=null) {
    		
    		tempnode = tailnode.next;
			tailnode.next = tempnode.next;		
			tempnode.next = headnode;
			headnode = tempnode;
		}
		return headnode;
    }
   
}
