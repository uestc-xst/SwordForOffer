package com.uestc.xst;

public class Find {

    public static boolean Find(int [][] array,int target) {
    	
        if(array==null)
            return false;
            
		int col = array[0].length;
        int row = array.length;
        
		int i = 0;
        int j = col-1;
        
        while(i<row&&j>=0){
            if(target>array[i][j]){
                i++;
            }else if(target==array[i][j]){
                return true;
            }else{
                j--;
            }
        }
        
        return false;
		
    }
}
