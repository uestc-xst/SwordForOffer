package com.uestc.xst;

public class Power {

	/**
	 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
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
