package com.uestc.xst;

import java.util.ArrayList;

public class PrintFromTopToBottom {
	
	/**
	 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
	 * 使用两个list容器交替保存每一层的节点，顺便打印节点值
	 * @param root
	 * @return
	 */
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	
    	ArrayList<TreeNode> treeNodeslist1 = new ArrayList<>();
    	ArrayList<TreeNode> treeNodeslist2 = new ArrayList<>();
    	ArrayList<Integer> resultlist = new ArrayList<>();
    	
    	if (root!=null) {   		
    		treeNodeslist1.clear();
			treeNodeslist1.add(root);
		}else{
			return resultlist;
		}
    	
    	while(true){
    		
    		if (treeNodeslist1.size()!=0) {
				for(int i=0;i<treeNodeslist1.size();i++){
					resultlist.add(treeNodeslist1.get(i).val);
					if (treeNodeslist1.get(i).left!=null) {
						treeNodeslist2.add(treeNodeslist1.get(i).left);
						
					}
					if (treeNodeslist1.get(i).right!=null) {
						treeNodeslist2.add(treeNodeslist1.get(i).right);
					}
				}
				if (treeNodeslist2.size()==0) {
					return resultlist;
				}
				treeNodeslist1.clear();
			}else{
				for(int i=0;i<treeNodeslist2.size();i++){
					resultlist.add(treeNodeslist2.get(i).val);
					if (treeNodeslist2.get(i).left!=null) {
						treeNodeslist1.add(treeNodeslist2.get(i).left);
						
					}
					if (treeNodeslist2.get(i).right!=null) {
						treeNodeslist1.add(treeNodeslist2.get(i).right);
					}
				} 
				if (treeNodeslist1.size()==0) {
					return resultlist;
				}
				treeNodeslist2.clear();
			}
   		
    	}


    }
}
