package com.uestc.xst;

public class Merge {

    public static ListNode Merge(ListNode list1,ListNode list2) {
    	
        ListNode headnode = null;
        ListNode resulttemp = null;
        ListNode listtmp1 = list1;
        ListNode listtmp2 = list2;
        
        
        if(list1==null){
			return list2;
           
        }
        if(list2==null){
            
            return list1;
        }
        
        if(list1.val<list2.val){
            headnode = listtmp1;
            listtmp1 = listtmp1.next;
        }else{
            headnode = listtmp2;
            listtmp2 = listtmp2.next;
        }
        
        resulttemp = headnode;
        
        while(listtmp1!=null||listtmp2!=null){
            if(listtmp1!=null&&listtmp2!=null&&(listtmp1.val<listtmp2.val)){
                resulttemp.next = listtmp1;
                listtmp1 = listtmp1.next;
             
            }else if(listtmp1!=null&&listtmp2!=null&&(listtmp1.val>=listtmp2.val)){
                resulttemp.next = listtmp2;
                listtmp2 = listtmp2.next;
               
            }else if(listtmp1==null){
                resulttemp.next = listtmp2;
                listtmp2 = listtmp2.next;
               
            }else{
                resulttemp.next = listtmp1;
                listtmp1 = listtmp1.next;
              
            }
            resulttemp = resulttemp.next;          
        }
        return headnode;
    }
    
}
