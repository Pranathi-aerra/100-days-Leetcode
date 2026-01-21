import java.util.*;
public class Intersecof2LL1 {
  
 public class ListNode {
     int val;
    ListNode next;
     ListNode(int x) {
         val = x;
        next = null;
     }
 }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> hm=new HashMap<>();
        ListNode temp=headA;
        while(temp!= null)
        {
            hm.put(temp,hm.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null)
        {
            if(hm.containsKey(temp))   return temp;
            temp=temp.next;
        }
        return null;
}

}
