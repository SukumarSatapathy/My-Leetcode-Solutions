class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if n == 1:
            return
        
        ptr1, ptr2 = 0, 1
        while ptr2 < n:
            if nums[ptr1] == 0 and nums[ptr2] != 0:
                nums[ptr1], nums[ptr2] = nums[ptr2], nums[ptr1]
                ptr1 += 1
                ptr2 += 1
                
            elif nums[ptr1] == 0 and nums[ptr2] == 0:
                ptr2 += 1
            
            else:
                ptr2 += 1
                ptr1 += 1
            