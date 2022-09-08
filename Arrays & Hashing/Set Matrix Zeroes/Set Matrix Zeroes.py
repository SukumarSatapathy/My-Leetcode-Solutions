'''
Runtime: 135 ms, faster than 92.23% of Python3 online submissions for Set Matrix Zeroes.
Memory Usage: 14.8 MB, less than 54.57% of Python3 online submissions for Set Matrix Zeroes.

Time : O(m*n)
Space : O(m+n)
'''


class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        row = [1]*len(matrix)
        col = [1]*len(matrix[0])
        for i in range(len(row)):
            for j in range(len(col)):
                if matrix[i][j] == 0:
                    row[i] = 0
                    col[j] = 0
        for i in range(len(row)):
            for j in range(len(col)):
                if row[i] == 0 or col[j] == 0:
                    matrix[i][j] = 0
