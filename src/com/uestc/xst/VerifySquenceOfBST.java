package com.uestc.xst;

import java.util.Arrays;

public class VerifySquenceOfBST {

	
	/**
	 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
	 * 二叉树后序遍历时，左子树的节点值都小于根节点，而右子树的节点值都大于根节点值
	 * @param sequence
	 * @return
	 */
    public static boolean VerifySquenceOfBST(int [] sequence) {
        
    	boolean bBST = false;
    	
        if(sequence==null)
            return false;
        if (sequence.length==0) {
			return false;
		}
        if (sequence.length==1) {
			return true;
		}
        int seqlen = sequence.length;
        int lastval = sequence[seqlen-1];
        
        int index = -1;
        boolean bLeft = true;
        boolean bRight = true;
        int[] frontarr;
        int[] behindarr;
        
        for(int i=0;i<seqlen-1;i++){
        	bLeft &=(sequence[i]<lastval);
        	bRight &= (sequence[i]>lastval);
        }
        
        if (bLeft) {
			frontarr = Arrays.copyOfRange(sequence, 0, seqlen-1);
			if (frontarr.length==1) {
				return true;
			}
			return VerifySquenceOfBST(frontarr);
		}else if (bRight) {
        	behindarr = Arrays.copyOfRange(sequence,0,seqlen-1);
        	if (behindarr.length==1) {
				return true;
			}
			return VerifySquenceOfBST(behindarr);
		}else {
	        for(int i=0;i<seqlen;i++){
	        	if (sequence[i]>lastval) {
	        		index = i;
					break;
				}
	        }
	        for(int i=index;i<seqlen-1;i++){
	        	if(sequence[i]<lastval){
	        		return false;
	        	}
	        }
	        
			frontarr = Arrays.copyOfRange(sequence, 0, index);
			behindarr = Arrays.copyOfRange(sequence, index, seqlen-1);
			if (frontarr.length==1&&behindarr.length==1) {
				return true;
			}else if (frontarr.length==1) {
				return VerifySquenceOfBST(behindarr);
			}else if (behindarr.length==1) {
				return VerifySquenceOfBST(frontarr);
			}else {
				return VerifySquenceOfBST(frontarr)&&VerifySquenceOfBST(behindarr);
			}
			
		}
         


    }
    
}
