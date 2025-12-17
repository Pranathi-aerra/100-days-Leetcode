import java.util.*;
public class ME2 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>(nums.length/3))
            {
                s.add(nums[i]);
            }
        }
        List<Integer> l=new ArrayList<>(s);
        return l;
    }
    
}
