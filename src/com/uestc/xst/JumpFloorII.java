package com.uestc.xst;

public class JumpFloorII {


	/**
	 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
	 * @param target 台阶数目
	 * @return 有多少种跳法
	 */
    public static int JumpFloorII(int target) {
    	
        if(target==0||target==1)
            return 1;
        if(target==2)
            return 2;
        int sum = 0;
        for(int i=0;i<target;i++){
			sum += JumpFloorII(i);
        }
        return sum;

        
    }
    
}
