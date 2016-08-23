package com.uestc.xst;

public class Mirror {

	
    public static void Mirror(TreeNode root) {
        TreeNode roottemp = root;
        TreeNode node = null;
        if (root==null) {
			return;
		}
        if(roottemp.left!=null||roottemp.right!=null){
        	node = roottemp.left;
        	roottemp.left = roottemp.right;
        	roottemp.right = node;
        }
        
        Mirror(roottemp.left);
        Mirror(roottemp.right);
    }
    
}
