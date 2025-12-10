class ContainsDup1:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s=set()
        for i in range(len(nums)):
            s.add(nums[i])
        return len(nums)!=len(s)