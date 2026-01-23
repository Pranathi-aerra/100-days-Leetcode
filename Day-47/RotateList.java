public class RotateList {
   
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        if(head==null || k==0)  return head;
        int len=1;
        while(tail.next!=null)
        {
            len++;
            tail=tail.next;
        }
        
        k=k%len;
         if(k==0)    return head;
         tail.next=head;
         ListNode nn=findnthNode(head,len-k);
         head=nn.next;
         nn.next=null;
         return head;
    }
    public ListNode findnthNode(ListNode temp,int n)
    {
        int cnt=1;
        while(temp!=null)
        {
            if(cnt==n)  return temp;
            cnt++;
            //if(cnt==n)  return temp;
            temp=temp.next;
        }
        return temp;
    }

}
