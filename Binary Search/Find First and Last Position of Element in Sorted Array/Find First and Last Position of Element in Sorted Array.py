'''
Time : n*log(n)
Space : O(1)

Runtime: 178 ms, faster than 12.12% of Python3 online submissions for Find First and Last Position of Element in Sorted Array.
Memory Usage: 15.6 MB, less than 9.40% of Python3 online submissions for Find First and Last Position of Element in Sorted Array.

'''

class Solution:
    def findminindx(self,arr,k):
        low = 0
        high = len(arr) - 1
        minidx = - 1
        while low <= high:
            mid = (low + high) // 2
            if arr[mid] >= k:
                if arr[mid] == k:
                    minidx = mid 
                high = mid - 1
            if arr[mid] < k:
                low = mid + 1
        return minidx
    
    def findmaxidx(self,arr,k):
        low = 0
        high = len(arr) - 1
        maxidx = - 1
        while low <= high:
            mid = (low + high) // 2
            if arr[mid] <= k:
                if arr[mid] == k:
                    maxidx = mid 
                low = mid + 1
            if arr[mid] > k:
                high = mid - 1
        return maxidx
    
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        min_index = self.findminindx(nums,target)
        max_index = self.findmaxidx(nums,target)
        return [min_index,max_index]
