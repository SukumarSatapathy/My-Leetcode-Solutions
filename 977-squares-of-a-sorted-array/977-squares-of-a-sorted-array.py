class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        ptr1, ptr2 = 0, len(nums)-1
        squares = [0]*len(nums)
        c = len(nums)-1
        
        while ptr1 <= ptr2:
            if abs(nums[ptr1]) >= abs(nums[ptr2]):
                squares[c] = nums[ptr1]*nums[ptr1]
                ptr1 += 1
            
            elif abs(nums[ptr1]) < abs(nums[ptr2]):
                squares[c] = nums[ptr2]*nums[ptr2]
                ptr2 -= 1
            
            c -= 1
        
        return squares