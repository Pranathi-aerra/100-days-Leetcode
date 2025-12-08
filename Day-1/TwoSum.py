class TwoSum:
    def  twosum(self,nums,target):
        hm={}
        for i,num in enumerate(nums):
            rem=target-num
            if rem in hm:
                return hm[rem],i
            hm[num]=i
