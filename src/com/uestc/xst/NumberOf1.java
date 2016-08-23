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
     * ��ָoffer�ṩ��һ��ⷨ
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
     * ��㷽����n���ж��ٸ�1��ѭ�����ٴΣ���n����һλ��1��n-1���ұ�һλ��Ϊ0����n���ұ�һλ����0��n-1��ԭ�����ұߵ�1��Ϊ0���ұߵ�0����Ϊ1������1100-1=1011.
     * ��ʱn&(n-1)ʹ��ԭ�����ұߵ�1�Լ��ұߵ�0����Ϊ0���Դ����ƣ�ֱ��n��Ϊ�㡣
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
