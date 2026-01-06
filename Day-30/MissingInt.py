class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        tsum=len(nums)*(len(nums)+1)/2
        csum=sum(nums)
        return int(tsum-csum)

        