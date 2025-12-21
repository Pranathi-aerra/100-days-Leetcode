import java.util.*;
public class ValidAnagram {
    

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs)
        {
            char []ch=s.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!hm.containsKey(st))
            {
                 hm.put(st,new ArrayList<>());
            }
            hm.get(st).add(s);
        }  
        ans.addAll(hm.values());
        return ans;
        }
}


