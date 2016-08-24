package com.uestc.xst;

public class HasSubtree {
	
	/**
	 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ��
	 * @param root1 A��
	 * @param root2 B��
	 * @return 
	 */
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	
    	if (root2==null) {		//������������һ�������ӽṹ
			return false;
		}
    	if (root1==null) {		//���AΪ�գ��ǿ϶�����false
			return false;
		}
    	if(root2.val==root1.val){		//A��B�Ƚϵĸ��ڵ��ֵ��ͬ
    		
    		if (root2.left==null&&root2.right==null) {		//�ȽϵĽڵ���B��β�ڵ�
				return true;
			}
    		//�������ֱȽϵ��ǱȽϵĽڵ���ȫ��ͬ�����
    		if ((root2.left!=null&&root2.right!=null)&&(root1.left!=null&&root1.right!=null)&&root2.left.val==root1.left.val&&root2.right.val==root1.right.val) {
    			return HasSubtree(root1.left,root2.left)&& HasSubtree(root1.right,root2.right);
			}else if ((root2.left!=null&&root2.right==null)&&(root1.left!=null&&root1.right==null)&&root2.left.val==root1.left.val) {
				return HasSubtree(root1.left,root2.left);
			}else if ((root2.left==null&&root2.right!=null)&&(root1.left==null&&root1.right!=null)&&root2.right.val==root1.right.val) {
				return HasSubtree(root1.right,root2.right);
			}else{		//�ȽϵĽڵ㲻ͬ��A�������ӽڵ��ƶ�һ���ٱȽ�
				if (root1.left!=null&&root1.right!=null) {
					return  HasSubtree(root1.left,root2)|| HasSubtree(root1.right,root2);
				}else if(root1.left==null&&root1.right!=null){
					return  HasSubtree(root1.right,root2);
				}else if(root1.left!=null&&root1.right==null){
					return  HasSubtree(root1.left,root2);
				}else {
					return false;
				}	
			}
    	//�Ƚϵĸ��ڵ��ֵ����ͬ��ֱ���������ӽڵ㻬��	
    	}else if(root1.left!=null&&root1.right==null){
    		return HasSubtree(root1.left,root2);
    	}else if(root1.left==null&&root1.right!=null){
    		return HasSubtree(root1.right,root2);
    	}else{
    		return false;
    	}
    }
    
}
