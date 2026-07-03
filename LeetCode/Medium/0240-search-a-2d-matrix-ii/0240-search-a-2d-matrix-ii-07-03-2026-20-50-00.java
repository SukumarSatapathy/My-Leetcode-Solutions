class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force - search every element in the matrix
        // O(m x n) time, O(1) space

        // sol 2 : bin search on each row
        // O(m log n) time, O(1) space

        // m[r][c] -> m[4][5]

        // O(m + n) time // because at max we will visit m rows and n cols since we are eliminating a row or col at every step
        // O(1) space
        int m = matrix.length;
        if (m == 0) return false;

        int n = matrix[0].length;
        int row = 0, col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}