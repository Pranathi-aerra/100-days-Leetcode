import java.util.*;
public class LongestSubstrinhWithoutRepeatingCharacters {
   
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;
        int lft=0,rgt=0;
        while(rgt<s.length())
        {
            char c=s.charAt(rgt);
            if(hm.containsKey(c))
            {
                    if(hm.get(c)>=lft)
                    {
                        lft=hm.get(c)+1;
                    }
            }
            max=Math.max(max,rgt-lft+1);
            hm.put(c,rgt);
            rgt++;
        }
        return max;
    
}
       
}
