
public class FlattenMDLL {

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};



    public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.child!=null)
            {
                Node after=temp.next;
                temp.next=flatten(temp.child);
                temp.next.prev=temp;
                temp.child=null;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                if(after!=null)
                {
                    temp.next=after;
                    after.prev=temp;
                }
            }
            temp=temp.next;
        }
        return head;
    }

}
