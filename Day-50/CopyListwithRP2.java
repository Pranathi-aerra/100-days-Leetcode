
public class CopyListwithRP2 {
  
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null)
        {
            Node nn=new Node(temp.val);
            nn.next=temp.next;
            temp.next=nn;
            temp=nn.next;
        }
        temp=head;
        while(temp!=null)
        {
            Node copy=temp.next;
            if(temp.random!=null)   copy.random=temp.random.next;
            else    copy.random=null;
            temp=temp.next.next;
        }
        Node dummy=new Node(-1);
        Node res=dummy;
        temp=head;
        while(temp!=null)
        {
            res.next=temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;
        }
        return dummy.next;
    }

}
//TC:O(N)
//SC:O(1)