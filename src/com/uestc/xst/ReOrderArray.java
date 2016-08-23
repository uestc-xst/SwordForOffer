package com.uestc.xst;

public class ReOrderArray {
    public static void reOrderArray(int [] array) {
        
        int len = array.length;
        int Jindex = 0;
        int Oindex = 0;
        
        for(int i=0;i<len;i++){
			if(array[i]%2==0){
				Oindex = i;
                for(int j=i;j<len;j++){
                    if(array[j]%2==1){
                        Jindex = j;
                        int temp = array[j];
                        movearr(array,Oindex,Jindex);
                        array[Oindex] = temp;
                        break;
                    }
                }
            }
            
        }
    }
    
    public static int[] movearr(int[] arr,int first,int last){
        for(int i=last;i>first;i--){
            arr[i] = arr[i-1];
        }
        return arr;
    }
}
