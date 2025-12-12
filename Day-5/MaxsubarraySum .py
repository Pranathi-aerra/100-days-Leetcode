class MaxsubarraySum:
    def maxSubArray(self, nums: List[int]) -> int:
        cursum=nums[0]
        maxsum=nums[0]
        for i in range(1,len(nums)):
            cursum=max(cursum+nums[i],nums[i])
            maxsum=max(cursum,maxsum)
        return maxsum
        