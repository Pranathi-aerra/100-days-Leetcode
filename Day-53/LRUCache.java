public class LRUCache {
    class LRUCache {
    HashMap<Integer,Node> hm;
    int capacity;
    Node lru,mru;
    public LRUCache(int capacity) {
        hm=new HashMap<>();
        this.capacity=capacity;
        lru=new Node(0,0);
        mru=new Node(0,0);
        lru.next=mru;
        mru.prev=lru;
        
    }
    
    public int get(int key) {
        if(!hm.containsKey(key))    return -1;
        Node nn=hm.get(key);
        remove(nn);
        addfront(nn);
        return nn.val;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key))
        {
            Node nn=hm.get(key);
            nn.val=value;
            remove(nn);
            addfront(nn);
        }
        else{
            if(hm.size()>=capacity)
            {
                Node del=mru.prev;
                remove(del);
                hm.remove(del.key);

            }
            Node nn=new Node(key,value);
            addfront(nn);
            hm.put(key,nn);
        }
    }
    public void remove(Node nn)
    {
        nn.prev.next=nn.next;
        nn.next.prev=nn.prev;

    }
    public void addfront(Node nn)
    {
        nn.next=lru.next;
        nn.prev=lru;
        lru.next.prev=nn;
        lru.next=nn;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
 class Node
 {
    Node next,prev;
    int key,val;
    Node(int key,int val)
    {
        this.key=key;
        this.val=val;
    }
 }
}
