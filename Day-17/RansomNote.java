import java.util.*;
public class RansomNote {
   
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:magazine.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            if(!hm.containsKey(ch)|| hm.get(ch)==0)
            {
                return false;
            }
            hm.put(ch,hm.get(ch)-1);
        }
        return true;
    }
}

