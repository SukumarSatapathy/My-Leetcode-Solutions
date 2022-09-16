class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        dict_nums = {}
        for val in nums:
            dict_nums[val] = 1
        
        for i in range(len(nums)+1):
            if i not in dict_nums:
                return i