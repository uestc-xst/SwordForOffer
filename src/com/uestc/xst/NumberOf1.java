package com.uestc.xst;

public class NumberOf1 {
	

    public static int NumberOf1(int n) {
		
        int count = 0;
		String n_str = Integer.toHexString(n);
        int sum = 0;
        
        int len = n_str.length();
        for(int i=0;i<len;i++){
			sum += getCharnumOf1(n_str.substring(i,i+1));
        }
		return sum;
    }
    

    public static int getCharnumOf1(String word){
        switch(word){
        	case "0":
            	return 0;
            case "1":
            case "2":
            case "4":
            case "8":
            	return 1;
            case "3":
            case "5":
            case "6":
            case "9":
            case "a":
            case "c":
            	return 2;
            case "7":            
            case "b":
            case "d":
            case "e":
            	return 3;
            case "f":
            	return 4;
            default:
            	return 0;
        }	
    }
    
    /**
     * 剑指offer提供的一般解法
     * @param n
     * @return
     */
    public static int NumberOf11(int n) {
		
		int count = 0;
        int flag = 1;
        while(flag!=0){
            if((n&flag)!=0){
				count++;
            }
            flag <<= 1;    
        }
        return count;
    }  
    
    /**
     * 简便方法，n中有多少个1就循环多少次，当n最后边一位是1，n-1最右边一位变为0，当n最右边一位不是0，n-1后，原来最右边的1变为0，右边的0都变为1，例如1100-1=1011.
     * 此时n&(n-1)使得原来最右边的1以及右边的0都变为0，以此类推，直到n变为零。
     * @param n
     * @return
     */
    public static int NumberOf12(int n) {
		int count = 0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
    
}
