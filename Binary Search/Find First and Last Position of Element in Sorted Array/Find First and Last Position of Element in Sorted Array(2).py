'''
Runtime: 188 ms, faster than 7.81% of Python3 online submissions for Find First and Last Position of Element in Sorted Array.
Memory Usage: 15.4 MB, less than 47.94% of Python3 online submissions for Find First and Last Position of Element in Sorted
'''

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        left, right = 0, len(nums) - 1
        start, end = -1, -1
        if len(nums) == 0:
            return [-1, -1]
        if nums[len(nums) - 1] == target:
            end = len(nums) - 1
# looking for the first target index
        while left < right:
            mid = (left + right) // 2
            if nums[mid] == target:
                start = mid
                right = mid
            elif nums[mid] > target:
                right = mid - 1
            else:
                left = mid + 1
# looking for the last target index
        left, right = start, len(nums) - 1
        while left <= right:
            mid = (left + right) // 2
            if nums[mid] == target:
                end = mid
                left = mid + 1
            elif nums[mid] > target:
                right = mid - 1
            else:
                left = mid + 1
        if (start > -1) and (end > -1):
            return [start, end]
        elif (start == -1) and (end > -1):
            return [end, end]
        else:
            return [-1, -1]
