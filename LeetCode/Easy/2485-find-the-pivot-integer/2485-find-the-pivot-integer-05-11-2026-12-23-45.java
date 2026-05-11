class Solution {
    public int pivotInteger(int n) {
        // balance/equilibrium point pattern
        // O(n) time and O(1) space using vars
        // Following exact ques definition
        int prefixSum = 0; 
        int total = n * (n+1) / 2;

        for (int i = 1; i <= n; i++) {
            prefixSum += i;
            int suffixSum = total - prefixSum + i;
            if (prefixSum == suffixSum) return i;
        }
        return -1;
    }
}