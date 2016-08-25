package com.uestc.xst;

import java.util.ArrayList;



public class IsPopOrder {

	/**
	 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
	 * ����ѹ��ջ���������־�����ȡ�
	 * @param pushA
	 * @param popA
	 * @return
	 */
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
    	
    	if (popA==null||pushA==null||popA.length!=pushA.length) {
			return false;
		}
    	
    	ArrayList<Integer> pushList = new ArrayList<>();
    	
    	
    	for(int i=0;i<pushA.length;i++){
    		pushList.add(pushA[i]);
    	}
    	//�ж�popA��pushA�����Ƿ��в�ƥ�������
    	for(int i=0;i<popA.length;i++){
    		if (pushList.indexOf(popA[i])==-1) {
				return false;
			}
    	}
    	//�ж����ɣ���popA[i]��������Լ�С�������ǰ�����ջ����������������ȷ��ջ�ģ�������
    	for(int i=0;i<popA.length-1;i++){
    		int index = pushList.indexOf(popA[i]);
    		for(int j=i+1;j<popA.length;j++){
    			if (pushList.indexOf(popA[i])>pushList.indexOf(popA[j])) {
					int indextemp = pushList.indexOf(popA[j]);
					if (indextemp>index) {
						return false;
					}else{
						index = indextemp;
					}
					
				}
    		}
    	}
		return true;
    	
    }
    
}
