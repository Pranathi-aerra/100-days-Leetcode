public class Sqrtx {
   
    public int mySqrt(int x) {
     int low=1,high=x;
     while(low<=high)
     {
        int mid=low+(high-low)/2;
        long sqr=(long)mid*mid;
        if(sqr==x)
        {
            return mid;
        }
        else if(sqr<x)
        {
            low=mid+1;
        }
        else{
            high=mid-1;
        }
     }
     return high;
    }
}
