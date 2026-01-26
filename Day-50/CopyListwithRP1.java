import java.util.*;
public class CopyListwithRP1 {
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
        HashMap<Node,Node> hm=new HashMap<>();
        Node temp=head;
        while(temp!=null)
        {
            Node nn=new Node(temp.val);
            hm.put(temp,nn);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            Node nn=hm.get(temp);
            nn.random=hm.get(temp.random);
            nn.next=hm.get(temp.next);
            temp=temp.next;

        }
        return hm.get(head);
    }

}
//TC:O(2N)
//SC:O(N)+O(N)
