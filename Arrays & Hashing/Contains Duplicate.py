class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        distinct_list = list(set(nums))
        if len(distinct_list) == len(nums):
            return False
        else:
            return True
