package com.uestc.xst;

public class FindKthToTail {
	
	/**
	 * ����һ�����������������K������
	 * ����˼·����ͷ�ڵ㿪ʼ������ÿ�ε���һ���µĽڵ����¼��㵱ǰ�ڵ��ǲ��ǵ�����K���ڵ㣬����ǣ�����ڵ㣬������ǣ��ƶ�����һ���ڵ㣬ֱ������������
	 * @param head	���������ͷ�ڵ�
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
