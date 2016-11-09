package com.uestc.xst;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class BinaryTreeToList {
	
	
	/**
	 * ������ת��Ϊ˫������
	 * ���㷨û�п��ǵ���������˫�����������Υ�����⿪���¿ռ䣬ʧ�ܵ��㷨
	 * @param pRootOfTree
	 * @return
	 */
    public static TreeNode Convert(TreeNode pRootOfTree) {
    	
    	//1. ���������е� �ڵ��ŵ�HashMap��
    	HashMap<Integer, TreeNode> map = new HashMap<>();
    	GetTreeNodes(pRootOfTree,map);

    	//2. ��SortedMap�ӿڶ�hashmap����
    	SortedMap<Integer, TreeNode> sortedMap = new TreeMap(map);

    	//3. �������ļ�����ϳ�˫������
    	TreeNode tempnode = null;
    	TreeNode pHead = null;
    	for(Entry<Integer, TreeNode> entry:sortedMap.entrySet()){
    		//System.out.println(entry.getKey()+":"+entry.getValue().val);
    		if (tempnode==null) {		//����ͷ�ڵ�
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
    
    //�����������еĽڵ㣬���浽map��
    public static void GetTreeNodes(TreeNode root,HashMap<Integer, TreeNode> map){
    	
    	if (root==null) {
			return;
		}  	
    	//�������
    	if (root.left!=null) {
    		GetTreeNodes(root.left,map);
		}
    	map.put(root.val, root);
    	if (root.right!=null) {
    		GetTreeNodes(root.right,map);
		}
    	
    	
    }
    
    
    /**
     * �������ϵĴ���
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
    
    //ͨ�����������������
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
