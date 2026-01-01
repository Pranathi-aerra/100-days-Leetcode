class Solution:
    def mySqrt(self, x: int) -> int:
        low=1
        high=x
        while(low<=high):
            mid=low+(high-low)//2
            sq=mid*mid
            if(sq==x):
                return mid
            elif sq<x:
                low=mid+1
            else:
                high=mid-1
        return high
        