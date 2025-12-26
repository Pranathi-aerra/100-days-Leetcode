import java.util.*;
public class LCP2 {
    public String longestCommonPrefix(String[] strs) 
    {
       
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
       String fir=strs[0];
       String last=strs[strs.length-1];
       int idx=0;
       while(idx<fir.length() && idx<last.length() && fir.charAt(idx)==last.charAt(idx))
       {
            idx++;
       }
       return fir.substring(0,idx);
    }
}
//sorting + checking common prefix of first and last ele
//TC:O(nlogn)
//SC:o(1)

       

