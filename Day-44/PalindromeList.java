import java.util.*;
public class PalindromeList {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public boolean isPalindrome(ListNode head) {
       Stack<Integer> st=new Stack<>();
       ListNode temp=head;
       while(temp!=null)
       {
        st.push(temp.val);
        temp=temp.next;
       }
       temp=head;
       while(temp!=null)
       {
        if(temp.val!=st.peek()) return false;
        st.pop();
        temp=temp.next;
       }
       return true;
    }
}

//TC:0(2N)
//SC:O(N) for stack
