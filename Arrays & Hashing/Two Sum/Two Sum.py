'''
Runtime: 117 ms, faster than 49.53% of Python3 online submissions for Two Sum.
Memory Usage: 15.3 MB, less than 23.96% of Python3 online submissions for Two Sum.
'''

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}
        for i, n in enumerate(nums):
            diff = target - nums[i]
            if diff in hashMap:
                return [i, hashMap[diff]]
            hashMap[n] = i
            
