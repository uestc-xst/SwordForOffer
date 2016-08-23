package com.uestc.xst;

public class ReverseList {

	
	/**
	 * ��ת��������һ�������������ķ�ת����
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
