public class Powerof2bruteforce {
  
    public boolean isPowerOfTwo(int n) {
       StringBuilder sb=new StringBuilder();
       while(n>0)
       {
        int rem=n%2;
        sb.append(rem);
        n=n/2;
       }
       String str=sb.reverse().toString();
       int cnt=0;
       for(int i=0;i<str.length();i++)
       {
        if(str.charAt(i)=='1')
        {
            cnt++;
        }
        
       }
       return cnt==1;
    }
}
