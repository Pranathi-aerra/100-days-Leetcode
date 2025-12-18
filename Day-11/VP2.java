public class VP2 {
 
    public boolean validPalindrome(String s) {
        int lft=0,rgt=s.length()-1;
        while(lft<rgt)
        {
            if(s.charAt(lft)==s.charAt(rgt))
            {
                lft++;
                rgt--;
            }
            else{
                return isvalid(s,lft+1,rgt) || isvalid(s,lft,rgt-1);
            }
        }
        return true;
    }
    public boolean isvalid(String s,int lft,int rgt)
    {
        while(lft<rgt)
        {
            if(s.charAt(lft)!=s.charAt(rgt))
            {
                return false;
            }
            lft++;
                rgt--;
        }
        return true;
    }
}

