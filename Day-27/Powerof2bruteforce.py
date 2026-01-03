class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        cnt=0
        strs=[]
        while n>0:
            rem=n%2
            strs.append(str(rem))
            n=n//2
        for i in strs:
            if i=='1':
                cnt+=1
        return cnt==1
        