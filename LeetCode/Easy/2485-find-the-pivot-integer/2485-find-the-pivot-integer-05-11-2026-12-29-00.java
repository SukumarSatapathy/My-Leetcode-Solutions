class Solution {
    public int pivotInteger(int n) {
        // Total sum from 1 to n = n * (n + 1) / 2
        int totalSum = n * (n + 1) / 2;
        
        // Sum from 1 to x = x * (x + 1) / 2
        // Sum from x to n = totalSum - x * (x - 1) / 2
        
        // For pivot: sum[1,x] = sum[x,n]
        // x * (x + 1) / 2 = totalSum - x * (x - 1) / 2
        // x² = totalSum
        // x = sqrt(totalSum) -> So balance point exists only if total sum is a perfect square
        
        int x = (int) Math.sqrt(totalSum);
        
        if (x * x == totalSum) { // O(1) time and space
            return x;
        } 
        return -1;
    }
}