
public class EvenOddLL {
  
  public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode oddEvenList(ListNode head) {
        ListNode dum1=new ListNode(-1);
        ListNode t1=dum1;
        ListNode dum2=new ListNode(-1);
        ListNode t2=dum2;
        int idx=1;
        if(head==null || head.next==null)
        {
            return head;
        }
        while(head!=null)
        {
            if((idx%2)!=0)
            {
                t1.next=head;
                t1=t1.next;
                head=head.next;

            }
            else{
                t2.next=head;
                t2=t2.next;
                head=head.next;
            }
            idx++;
        }
        t2.next=null;
        t1.next=dum2.next;
        return dum1.next;
    }

}
