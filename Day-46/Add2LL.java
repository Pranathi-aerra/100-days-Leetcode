public class Add2LL {
  
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
       ListNode dummy=new ListNode(-1);
       ListNode curr=dummy;
       ListNode t1=l1;
       ListNode t2=l2;
       int carry=0;
       while(t1!=null || t2!=null)
       {
          int add=carry;
          if(t1!=null)  add+=t1.val;
          if(t2!=null)  add+=t2.val;
          ListNode nn=new ListNode(add%10);
          carry=add/10;
          curr.next=nn;
          curr=curr.next;
          if(t1!=null)  t1=t1.next;
          if(t2!=null)  t2=t2.next;

       }
       if(carry>0)
       {
        ListNode car=new ListNode(carry);
        curr.next=car;
       }
  return dummy.next;


            
    }
}

