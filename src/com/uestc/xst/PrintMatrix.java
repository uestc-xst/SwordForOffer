package com.uestc.xst;

import java.util.ArrayList;

public class PrintMatrix {

	
	/**
	 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
	 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
	 * @param matrix
	 * @return
	 */
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
    	
    	
    	ArrayList<Integer> resultlist = new ArrayList<>();
    	if (matrix==null) {
			return resultlist;
		}
    	
    	int row = matrix.length;
    	int col = matrix[0].length;
		
    	if (row==1) {
			for(int i=0;i<col;i++){
				resultlist.add(matrix[0][i]);
			}
			return resultlist;
		}
    	
    	int cnt = ((col+1)/2)>((row+1)/2)?(row+1)/2:(col+1)/2;
    	for(int i=0;i<cnt;i++){
    		if ((col-i>i)) {
				for(int j=i;j<col-i;j++){
					resultlist.add(matrix[i][j]);
				}
				if ((row-i-1)>i) {
					for(int k=i+1;k<(row-i-1);k++){
						resultlist.add(matrix[k][col-i-1]);
					}
					for(int k=col-1-i;k>=i;k--){
						resultlist.add(matrix[row-i-1][k]);
					}
					if(col-1-i>i){
						for(int k=(row-i-2);k>i;k--){
							resultlist.add(matrix[k][i]);
						}						
					}

				}
				
			}
    	}
    	
    	return resultlist;
        
    }
}
