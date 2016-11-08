package com.uestc.xst;

import java.util.ArrayList;


public class FindPath {

	
	/**
	 * 二叉树中和为某一值的路径
	 * @param root		根节点
	 * @param target	目标值
	 * @return			路径集合
	 */
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {

    	ArrayList<Integer> path = new ArrayList<>();
    	ArrayList<ArrayList<Integer>> resultpath = new ArrayList<>();
    	
    	int cursum = 0;
    	
    	if (root==null) {
			return resultpath;
		}
    	
    	FindSubPath(root,resultpath,path,cursum,target);
    	
		return resultpath;
        
    }
    
    public static void FindSubPath(TreeNode root,			
    		ArrayList<ArrayList<Integer>> resultpath, 
    		ArrayList<Integer>path,
    		int cursum,
    		int target) {
    	
    	cursum += root.val;
    	path.add(root.val);
    	
    	boolean bEndNode = (root.left==null)||(root.right==null);
    	
    	//叶节点且当前路径满足要求
    	if (cursum==target&&bEndNode) {
    		ArrayList<Integer> templist = new ArrayList<>();
    		templist.addAll(path);
    		resultpath.add(templist);
		}

    	//非叶节点
    	if (root.left!=null) {
    		FindSubPath(root.left,resultpath,path,cursum,target);
		}
    	if (root.right!=null) {
    		FindSubPath(root.right,resultpath,path,cursum,target);
		}
        
    	//返回到父节点，path弹出当前节点，cursum减去当前节点值
    	cursum -= root.val;
    	path.remove(path.size()-1);
    	
    	
    }
}
