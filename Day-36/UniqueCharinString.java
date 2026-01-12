import java.util.*;
public class UniqueCharinString {
    public int firstUniqChar(String s) {
      int []freq=new int[26];
      for(char ch:s.toCharArray())
      {
        freq[ch-'a']++;
      }
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<s.length();i++)
      {
        if(freq[s.charAt(i)-'a']==1)
        {
            st.push(i);
        }
      }
      int res=Integer.MAX_VALUE;
      while(!st.isEmpty())
      {
        res=Math.min(res,st.pop());
      }
      if(res==Integer.MAX_VALUE)    return -1;
      return res;
    }

}
