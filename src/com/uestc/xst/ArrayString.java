package com.uestc.xst;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayString {
	
	/**
	 * �ַ�����������
	 * @param str
	 * @return
	 */
    public static ArrayList<String> Permutation(String str) {
    	
    	if (str==null) {
			return null;
		}

    	int maplen = str.length();
    	char[] chars = new char[maplen];
    	chars = str.toCharArray();
    	
    	//���������ĸ���µ��ַ���
    	ArrayList<String> list = new ArrayList<>();
    	PermutationHelper2(chars,0,list);
    	
    	//�Լ�������
    	Collections.sort(list);
    
    	return list;
        
    }
    
    private static void PermutationHelper(char[] cs, int i, ArrayList<String> list) {
        if(i == cs.length - 1) { //��ռ��һ��Ҷ�ڵ�
            list.add(String.valueOf(cs)); //�ҵ�һ����
        } else {
            for(int j = i; j < cs.length; ++j) {
                if(j == i || cs[j] != cs[i]) {
                    char temp = cs[i];
                    cs[i] = cs[j];
                    cs[j] = temp;
                    PermutationHelper(cs, i + 1, list);
                    temp = cs[i];
                    cs[i] = cs[j];
                    cs[j] = temp;
                    
                }
            }
        }
    }
    
    private static void PermutationHelper2(char[] cs, int i, ArrayList<String> list) {
    	if (i==cs.length-1) {
    		list.add(String.valueOf(cs));
    		return;
		}
    	for(int j=i;j<cs.length;++j){
    		if(j == i || cs[j] != cs[i]) {
    		char temp = cs[i];
    		cs[i] = cs[j];
    		cs[j] = temp;
    		
    		
    			PermutationHelper2(cs,i+1,list);				
			
    		
    		temp = cs[i];
    		cs[i] = cs[j];
    		cs[j] = temp;
    		}
    	}
    }   
}
