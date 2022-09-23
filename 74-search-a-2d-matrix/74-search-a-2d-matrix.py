class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        low, high = 0, len(matrix)-1
        while low <= high:
            mid = (low+high)//2
            if target < matrix[mid][0]:
                high = mid-1
            elif target > matrix[mid][0]:
                low = mid+1
            else:
                return True
        
        row = high
        l, r = 0, len(matrix[0])-1
        while l <= r:
            mid = (l+r)//2
            if target < matrix[row][mid]:
                r = mid-1
            elif target > matrix[row][mid]:
                l = mid+1
            else:
                return True
        
        return False
            

