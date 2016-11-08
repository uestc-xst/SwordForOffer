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
}
