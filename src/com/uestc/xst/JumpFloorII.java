package com.uestc.xst;

public class JumpFloorII {


	/**
	 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
	 * @param target ̨����Ŀ
	 * @return �ж���������
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
