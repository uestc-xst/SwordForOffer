package com.uestc.xst;

public class Power {

	/**
	 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
	 * @param base
	 * @param exponent
	 * @return
	 */
    public static double Power(double base, int exponent) {
        double result = 1;
        if(exponent>=0){
            for(int i=0;i<exponent;i++){
                result *= base;
            }
            return result;            
        }else{
            for(int i=0;i<-exponent;i++){
				result /= base;
            }
            return result;
        }

  }
    
}
