package com.uestc.xst;

import java.util.ArrayList;

public class GetUglyNumber_Solution {
	
	

    /**
     * ���ص�index������
     * ���ַ�����index֮ǰ��ÿ���������ж��Ƿ�Ϊ������Ч�ʽϵ�
     * @param index
     * @return
     */
    public static int GetUglyNumber_Solution(int index) {
    	
    	if (index==0) {
			return 0;
		}
    	int[] uglyarr = new int[]{1,2,3,4,5};
    	
    	if (index<6) {
			return uglyarr[index-1];
		}
    	
    	int startnum = 6;
    	int cntindex = 6;
    	
    	while(cntindex<=index){

    		boolean bUgly = bUglyNumber(startnum);
    		if (bUgly) {
				cntindex++;
				startnum++;
			}else{
				startnum++;
			}
    		
    	}

        return startnum-1;
    }
    
    /**
     * �ж�num�Ƿ�Ϊ����
     * @param num
     * @return
     */
    private static boolean bUglyNumber(int num){
    	boolean bUgly = false;
    	while((num%2==0||num%3==0||num%5==0)){
    		if (num%2==0) {
				num /= 2;
	    		if(num==2||num==3||num==5){
	    			bUgly = true;
	    		}
			}
    		if(num%3==0){
    			num /= 3;
        		if(num==2||num==3||num==5){
        			bUgly = true;
        		}
    		}
    		if(num%5==0){
    			num /= 5;
        		if(num==2||num==3||num==5){
        			bUgly = true;
        		}
    		}
    	}
    	
    	return bUgly;
    	
    }
    
    /**
     * �ж�num�Ƿ�Ϊ����
     * @param num
     * @return
     */
    static boolean bUglyNumber2(int num){
    	while(num%2==0)
    		num /= 2;
    	while(num%3==0)
    		num /= 3;
    	while(num%5==0)
    		num /= 5;
    	return (num==1)?true:false;
    	
    }
    
    
    /**
     * �����index������ֵ
     * �����鱣�����õ��ĳ������ÿռ任ʱ�䣬ֻ������������ڷǳ��������м���
     * ���㣺����ǰ6����������������ֵ��ȣ�����ĵ�һ����������ǰ��ĳ�����2��3��5�ĳ˻���һ������ǰ�����һ��������Сֵ
     * @param index
     * @return
     */
    public static int GetUglyNumber_Solution2(int index){
    	
    	int[] uglyarr = new int[index];

    	int m2 = 0, m3 = 0, m5 = 0;
    	int m2_temp = 0, m3_temp = 0, m5_temp = 0;
    	
    	if (index<7) {
			return index;
		}
    	
    	for(int i=0;i<6;i++){
    		uglyarr[i] = i+1;
    	}
    	
    	for(int i=6;i<index;i++){
    		m2 = 0;
    		m3 = 0;
    		m5 = 0;
    		for(int j=0;j<i;j++){
    			m2_temp = 2*uglyarr[j];
    			m3_temp = 3*uglyarr[j];
    			m5_temp = 5*uglyarr[j];
    			if (m2_temp>uglyarr[i-1]&&m2==0) {
					m2 = m2_temp;
				}
    			if (m3_temp>uglyarr[i-1]&&m3==0) {
					m3 = m3_temp;
				}
    			if (m5_temp>uglyarr[i-1]&&m5==0) {
					m5 = m5_temp;
				}
    			if(m2!=0&&m3!=0&&m5!=0){
    				break;
    			}
    		}
    		uglyarr[i] = m2>m3?(m3>m5?m5:m3):(m2>m5?m5:m2);
    	}
		return uglyarr[index-1];
    	
    }
}
