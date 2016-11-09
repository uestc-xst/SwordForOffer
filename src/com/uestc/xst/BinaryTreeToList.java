package com.uestc.xst;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class BinaryTreeToList {
	
	
	/**
	 * 二叉树转换为双向链表
	 * 该算法没有考虑到二叉树是双向二叉树，且违背题意开辟新空间，失败的算法
	 * @param pRootOfTree
	 * @return
	 */
    public static TreeNode Convert(TreeNode pRootOfTree) {
    	
    	//1. 将二叉树中的 节点存放到HashMap中
    	HashMap<Integer, TreeNode> map = new HashMap<>();
    	GetTreeNodes(pRootOfTree,map);

    	//2. 用SortedMap接口对hashmap排序
    	SortedMap<Integer, TreeNode> sortedMap = new TreeMap(map);

    	//3. 将排序后的集合组合成双向链表
    	TreeNode tempnode = null;
    	TreeNode pHead = null;
    	for(Entry<Integer, TreeNode> entry:sortedMap.entrySet()){
    		//System.out.println(entry.getKey()+":"+entry.getValue().val);
    		if (tempnode==null) {		//链表头节点
				tempnode = entry.getValue();
				pHead = tempnode;
			}else{
				tempnode.right = entry.getValue();
				entry.getValue().left = tempnode;
				tempnode = entry.getValue();
			}
    	}

		return pHead;
        
    }
    
    //遍历二叉树中的节点，保存到map中
    public static void GetTreeNodes(TreeNode root,HashMap<Integer, TreeNode> map){
    	
    	if (root==null) {
			return;
		}  	
    	//中序遍历
    	if (root.left!=null) {
    		GetTreeNodes(root.left,map);
		}
    	map.put(root.val, root);
    	if (root.right!=null) {
    		GetTreeNodes(root.right,map);
		}
    	
    	
    }
    
    
    /**
     * 参照网上的代码
     * @param pRootOfTree
     * @return
     */
    public static TreeNode Convert2(TreeNode pRootOfTree) {
    	
    	if (pRootOfTree==null) {
			return null;
		}
    	TreeNode lastnode = null;
    	TreeNode tailnode = InorderTraversing(pRootOfTree,lastnode);
		
		while(tailnode.left!=null){
			tailnode = tailnode.left;
		}
		return tailnode;
    	
    }
    
    //通过中序遍历连接链表
    public static TreeNode InorderTraversing(TreeNode node,TreeNode lastNodeInList){
    	
        if(node==null)  
            return null;  
        TreeNode current = node;  
        if(current.left!=null)  
            lastNodeInList = InorderTraversing(current.left,lastNodeInList);  
        current.left = lastNodeInList;  
        if(lastNodeInList!=null)  
            lastNodeInList.right = current;  
        lastNodeInList = current;  
        if(current.right!=null)  
            lastNodeInList = InorderTraversing(current.right,lastNodeInList);  
        return lastNodeInList;  
    	
    }
}
