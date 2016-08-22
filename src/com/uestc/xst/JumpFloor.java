package com.uestc.xst;

public class JumpFloor {
    public static int JumpFloor(int target) {
        
        int sum = 0;
        
		if(target%2==0){	//Å¼Êý
            int twonum = target/2;
            for(int i=twonum;i<=target;i++){
                sum += C(i,target-i);
            }
            
        }else{		//ÆæÊý
            int twonum = target/2;
            for(int i=0;i<=twonum;i++){
                sum+= C(target-i,i);
               // sum += C(twonum+1+i,target-i-1-twonum);
            }
        }
        return sum;
    }

    public static int C(int i, int j) {
		
    	long result = 1;
    	for(int m=0;m<j;m++){
    		result *= (i-m);
    	}
    	long temp = 1;
    	for(int m=1;m<=j;m++){
    		temp *= m;
    	}
    	
    	result /= temp;
		return (int)result ;
	}
	

}
