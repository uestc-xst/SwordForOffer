package com.uestc.xst;

public class Main {

	public static void main(String[] args) {
		
		//int sum = JumpFloor.C(28, 2);
/*		int sum = JumpFloor.JumpFloor(1);
		System.out.println(sum);*/

//		int[][] array = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
/*		int[][] array = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		boolean result = Find.Find(array, 1);
		System.out.println(result);*/
		
/*		int result = JumpFloorII.JumpFloorII(3);
		System.out.println(result);*/
		
/*		int cnt = NumberOf1.NumberOf11(-1234567);
		System.out.println(Integer.toHexString(-1234567));
		System.out.println(cnt);*/
		
/*		int[] array = {1,2,3,4,5,6,7};
		ReOrderArray.reOrderArray(array);*/
		
		ListNode[] nodes = new ListNode[6];
		nodes[0] = new ListNode(0);
		nodes[1] = new ListNode(1);
		nodes[2] = new ListNode(2);
		nodes[3] = new ListNode(3);
		nodes[4] = new ListNode(4);
		nodes[5] = new ListNode(5);
		nodes[0].next = nodes[1];
		nodes[1].next = nodes[2];
		nodes[2].next = nodes[3];
		nodes[3].next = nodes[4];
		nodes[4].next = nodes[5];
		
/*		ListNode head = FindKthToTail.FindKthToTail(nodes[0], 6);
		System.out.println(head.val);*/
		
		ListNode tail = ReverseList.ReverseList(nodes[0]);
		System.out.println(tail.val);
		
	}

}
