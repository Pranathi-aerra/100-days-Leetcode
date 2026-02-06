class MyLinkedList {
       class Node
       {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
       }
       Node head;
       int size;
    public MyLinkedList() {
        this.head=null;
        this.size=0;
    }
    
    public int get(int index) {
        if(index>=size || index<0)
        {
            return -1;
        }
        Node curr=head;
        for(int i=0;i<index;i++)
        {
            curr=curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        nn.next=head;
        head=nn;
        size++;
    }
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(head==null)
        {
            head=nn;
            size++;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=nn;
        nn.next=null;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size)
        {
            return;
        }
        if(index==0)
        {
            addAtHead(val);
            return;
        }
        if(index==size)
        {
            addAtTail(val);
            return;
        }
        Node nn=new Node(val);
        Node prevv=head;
        for(int i=0;i<index-1;i++)
        {
            prevv=prevv.next;
        }
      
        nn.next=prevv.next;
          prevv.next=nn;
          size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return; 
        }
        if(index==0)
        {
            head=head.next;
            size--;
            return;
        }
        Node prev=head;
        for(int i=0;i<index-1;i++)
        {
            prev=prev.next;
        }
        prev.next=prev.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
