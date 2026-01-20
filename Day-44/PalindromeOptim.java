public class PalindromeOptim {

 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public boolean isPalindrome(ListNode head) {
        ListNode mid=findmid(head);
        ListNode sec=reverse(mid.next);
        ListNode p1=head;
        ListNode p2=sec;
        boolean palindrome=true;
        while(p2!=null)
        {

            if(p1.val!=p2.val)
            {
                palindrome=false;
                break;
            }
            p1=p1.next;
            p2=p2.next;
        }
         mid.next = reverse(sec);
        return palindrome;
    }
       
        
    public ListNode findmid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while( fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)   return head;
        ListNode nn=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return nn;
    }
}

//TC:0(N) bczz of recusrive stack
//SC:O(1) no extra space