public class Powerof2bitmanp {
   
    public boolean isPowerOfTwo(int n) {
        if((n>0) && ((n-1)&(n))==0)
        {
            return true;
        }
        return false;
    }

}
