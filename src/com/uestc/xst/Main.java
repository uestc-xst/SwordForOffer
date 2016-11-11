package com.uestc.xst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

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
		
/*		ListNode[] nodes = new ListNode[6];
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
		nodes[4].next = nodes[5];*/
		
		
		
/*		ListNode head = FindKthToTail.FindKthToTail(nodes[0], 6);
		System.out.println(head.val);*/
		
/*		ListNode tail = ReverseList.ReverseList(nodes[0]);
		System.out.println(tail.val);*/
		
/*		nodes[0].next = nodes[2];
		nodes[2].next = nodes[4];
		nodes[1].next = nodes[3];
		nodes[3].next = nodes[5];
	
		ListNode result = Merge.Merge(nodes[0], nodes[1]);
		System.out.println(result.val);*/
		
/*//		int[][] array = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] array = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		int[][] array = new int[][]{{1,2,3},{5,6,7},{9,10,11},{13,14,15}};
//		int[][] array = new int[][]{{1,2,3},{5,6,7}};
///		int[][] array = new int[][]{{1,2},{5,6},{3,4}};
		ArrayList<Integer> resultlist = PrintMatrix.printMatrix(array);
		System.out.println(resultlist.size());*/
		
/*		TreeNode[] nodes = new TreeNode[5];
		nodes[0] = new TreeNode(8);
		nodes[1] = new TreeNode(8);
		nodes[2] = new TreeNode(9);
		nodes[3] = new TreeNode(2);
		nodes[4] = new TreeNode(5);
		
		nodes[0].left = nodes[1];
		nodes[1].left = nodes[2];
		nodes[2].left = nodes[3];
		nodes[3].left = nodes[4];

		
		TreeNode[] list = new TreeNode[3];
		list[0] = new TreeNode(8);
		list[1] = new TreeNode(9);
		list[2] = new TreeNode(2);
		list[0].left = list[1];
		list[1].left = list[2];*/
		
		
/*		boolean bsub = HasSubtree.HasSubtree(nodes[0], list[0]);
		System.out.println(bsub);*/
		

/*		int[] pushA = new int[]{1};
		int[] popA = new int[]{2};
		boolean bpoporder = IsPopOrder.IsPopOrder(pushA, popA);
		System.out.println(bpoporder);*/
		
		
/*		ArrayList<Integer> nodeslist = PrintFromTopToBottom.PrintFromTopToBottom(nodes[0]);
		System.out.println(nodeslist.size());*/
		
/*		int[] array = new int[]{4,6,7,5};
		boolean bBST = VerifySquenceOfBST.VerifySquenceOfBST(array);
		System.out.println(bBST);*/
		
/*		TreeNode[] nodes = new TreeNode[8];
		
		nodes[0] = new TreeNode(1);
		nodes[1] = new TreeNode(5);
		nodes[2] = new TreeNode(3);
		nodes[3] = new TreeNode(7);
		nodes[4] = new TreeNode(9);
		nodes[5] = new TreeNode(11);
		nodes[6] = new TreeNode(2);
		nodes[7] = new TreeNode(2);
		
		nodes[0].left = nodes[1];
		nodes[0].right = nodes[2];
		nodes[1].left = nodes[3];
		nodes[1].right = nodes[4];
		nodes[2].left = nodes[5];
		nodes[4].left = nodes[6];
		nodes[5].right = nodes[7];
		
		ArrayList<ArrayList<Integer>> hs = FindPath.FindPath(nodes[0], 17);
		System.out.println(hs.size());*/
		
/*		RandomListNode randomNode[] = new RandomListNode[5];
		randomNode[0] = new RandomListNode(10);
		randomNode[1] = new RandomListNode(11);
		randomNode[2] = new RandomListNode(12);
		randomNode[3] = new RandomListNode(13);
		randomNode[4] = new RandomListNode(14);
		randomNode[0].next = randomNode[1];
		randomNode[0].random = randomNode[2];
		randomNode[1].next = randomNode[2];
		randomNode[1].random = randomNode[4];
		randomNode[2].next = randomNode[3];
		randomNode[3].next = randomNode[4];
		randomNode[3].random = randomNode[1];
		
		RandomListNode head = CloneRandomListNode.Clone(randomNode[0]);
		System.out.println(head.label);*/
		
/*		int UglyNumber = GetUglyNumber_Solution.GetUglyNumber_Solution(37);
		System.out.println(UglyNumber);*/
		
/*		int test = GetUglyNumber_Solution.GetUglyNumber_Solution2(1537);
		System.out.println(test);*/

		/*HashMap<String,String> map=new HashMap<String, String>();  
		  map.put("1","11");  
		  map.put("2", "22");  
		  map.put("3", "33");  
		  for (Entry<String,String> entry: map.entrySet()) {  
		   System.out.println("排序之前:"+entry.getKey()+" 值"+entry.getValue());  
		     
		  }  
		  System.out.println("======================================================");  
		  SortedMap<String,String> sort=new TreeMap<String,String>(map);  
		  Set<Entry<String,String>> entry1=sort.entrySet();  
		  Iterator<Entry<String,String>> it=entry1.iterator();  
		  while(it.hasNext())  
		  {  
		   Entry<String,String> entry=it.next();  
		   System.out.println("排序之后:"+entry.getKey()+" 值"+entry.getValue());  
		  }  */

		/**------------搜索二叉树转换为双向链表测试用例------------**/
/*		TreeNode[] tree = new TreeNode[7];
		tree[0] = new TreeNode(10);
		tree[1] = new TreeNode(6);
		tree[2] = new TreeNode(14);
		tree[3] = new TreeNode(4);
		tree[4] = new TreeNode(8);
		tree[5] = new TreeNode(12);
		tree[6] = new TreeNode(16);
		tree[0].left = tree[1];
		tree[0].right = tree[2];
		tree[1].left = tree[3];
		tree[1].right = tree[4];
		tree[2].left = tree[5];
		tree[2].right = tree[6];
		
//		HashMap<Integer, TreeNode> map = new HashMap<>();
//		BinaryTreeToList.GetTreeNodes(tree[0], map);
//		Iterator<Entry<Integer, TreeNode>> iterator = map.entrySet().iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next().getKey());
//		}

		TreeNode listhead = BinaryTreeToList.Convert2(tree[0]);
		System.out.println(listhead.val);*/
		  
		ArrayList<String> aList = ArrayString.Permutation("abc");
		for (String string : aList) {
			System.out.println(string);
		}
		
		

		
	}

}
