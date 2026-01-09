import java.util.*;
public class NextGreaterOptimal {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []res=new int[nums1.length];
       Stack<Integer> st=new Stack<>();
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i:nums2)
       {
        while(!st.isEmpty() && st.peek()<i)
        {
            hm.put(st.pop(),i);
        }
        st.push(i);
       }
       while(!st.isEmpty())
       {
        hm.put(st.pop(),-1);
       }
       for(int i=0;i<nums1.length;i++)
       {
        res[i]=hm.get(nums1[i]);
       }
       return res;
    }
}

