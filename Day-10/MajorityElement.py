class MajorityElement:
     def majorityElement(self, nums: List[int]) -> int:
        hm={}
        for i in range(len(nums)):
            hm[nums[i]]=hm.get(nums[i],0)+1
            if hm[nums[i]]> len(nums)//2:
                return nums[i]
        return -1

        