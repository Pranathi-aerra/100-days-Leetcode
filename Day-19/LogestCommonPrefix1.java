public class LogestCommonPrefix1 {
    
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==1)
        {
            return strs[0];
        }
        if (strs == null || strs.length == 0) return "";

       String fir=strs[0];
       for(int i=0;i<fir.length();i++)
       {
        char ch=fir.charAt(i);
        for(int j=1;j<strs.length;j++)
        {
            if(i>=strs[j].length() || strs[j].charAt(i)!=ch)
            {
                return fir.substring(0,i);
            }
        }

       }return fir;
    }
}
//fix the first ele,now check if its characters match with the rem indixex
//TC:O(no of strings * len of shortest string)
//SC:O(1)

