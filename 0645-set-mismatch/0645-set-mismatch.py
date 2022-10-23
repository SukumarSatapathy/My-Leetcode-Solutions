class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        nums.sort()
        for i in range(len(nums)):
            if i-1 >= 0 and nums[i] == nums[i-1]:
                d = nums[i]
        m = (len(nums)*(len(nums)+1))//2 - (sum(nums) - d)
        return d, m
            