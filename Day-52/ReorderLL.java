public class ReorderLL {
  
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public void reorderList(ListNode head) {
        if(head==null || head.next==null)   return;
        ListNode middle=mid(head);
        ListNode rlist=reverse(middle.next);
        middle.next=null;
        reorder(head,rlist);


    }
    public ListNode mid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)   return head;
        ListNode revlist=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return revlist;
    }
    public void reorder(ListNode head,ListNode middle)
    {
      while(middle!=null)
      {
        ListNode t1=head.next;
        ListNode t2=middle.next;
        head.next=middle;
        middle.next=t1;
        head=t1;
        middle=t2;
      }
    }
}

