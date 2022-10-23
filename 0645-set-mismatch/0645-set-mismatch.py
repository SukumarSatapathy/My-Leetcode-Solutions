class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        nums.sort()
        n = len(nums)
        flag = False
        pos = 1
        for i in range(n):
            if i-1 >= 0 and nums[i] == nums[i-1]:
                duplicate = nums[i]
        missing = (n*(n+1))//2 - (sum(nums) - duplicate)
        return duplicate, missing
            