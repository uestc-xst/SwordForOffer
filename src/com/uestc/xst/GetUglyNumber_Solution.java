package com.uestc.xst;

import java.util.ArrayList;

public class GetUglyNumber_Solution {
	
	

    /**
     * 返回第index个丑数
     * 这种方法对index之前的每个数进行判断是否为丑数，效率较低
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
     * 判断num是否为丑数
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
     * 判断num是否为丑数
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
     * 计算第index个丑数值
     * 用数组保存计算得到的丑数，用空间换时间，只计算丑数，对于非丑数不进行计算
     * 计算：对于前6个数，丑数和索引值相等，后面的第一个丑数都是前面的丑数和2、3、5的乘积第一个大于前面最后一个数的最小值
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
