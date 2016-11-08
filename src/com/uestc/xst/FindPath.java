package com.uestc.xst;

import java.util.ArrayList;


public class FindPath {

	
	/**
	 * �������к�Ϊĳһֵ��·��
	 * @param root		���ڵ�
	 * @param target	Ŀ��ֵ
	 * @return			·������
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
    	
    	//Ҷ�ڵ��ҵ�ǰ·������Ҫ��
    	if (cursum==target&&bEndNode) {
    		ArrayList<Integer> templist = new ArrayList<>();
    		templist.addAll(path);
    		resultpath.add(templist);
		}

    	//��Ҷ�ڵ�
    	if (root.left!=null) {
    		FindSubPath(root.left,resultpath,path,cursum,target);
		}
    	if (root.right!=null) {
    		FindSubPath(root.right,resultpath,path,cursum,target);
		}
        
    	//���ص����ڵ㣬path������ǰ�ڵ㣬cursum��ȥ��ǰ�ڵ�ֵ
    	cursum -= root.val;
    	path.remove(path.size()-1);
    	
    	
    }
}
