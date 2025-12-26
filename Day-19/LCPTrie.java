public class LCPTrie {
   
    public String longestCommonPrefix(String[] strs) 
    {
        Node root=new Node();
        for (String s : strs) {
        if (s.length() == 0) {
            return "";
        }
    }

        for(String s:strs)  insert(root,s);
        return lcp(root);

    }
    public void insert(Node root,String s)
    {
        Node temp=root;
        for(int i=0;i<s.length();i++)
        {
            int idx=s.charAt(i)-'a';
            if(temp.children[idx]==null)
            {
                temp.children[idx]=new Node();
            }
            temp=temp.children[idx];
            if(i==s.length()-1)
            {
                temp.eow=true;
            }

        }
    }
    public String lcp(Node root)
    {
        
        StringBuilder sb=new StringBuilder();
        Node temp=root;
        while(true){
            int cnt=0;
            int idx=-1;
        for(int i=0;i<26;i++)
        {
            if(temp.children[i]!=null) 
            { cnt++;
            idx=i;
            }
        }
        if(cnt!=1 || temp.eow)
        {
            break;
        }
        sb.append((char)(idx+'a'));
        temp=temp.children[idx];
        }
        return sb.toString();
    }

}
class Node
{
    Node []children;
    boolean eow=false;
    int cnt=0;
    Node()
    {
        children=new Node[26];
    }
}

//using ties if anynode has 2 child then break
//TC:O(total number of characters in all strings)~ O(T)
//SC:O(total number of characters in all strings)
