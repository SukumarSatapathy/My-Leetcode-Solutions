class Solution {
    public int pivotInteger(int n) {
        // balance/equilibrium point pattern
        int[] prefixSum = new int[n+2]; // 2 extra since 1-indexed
        int total = 0;

        for (int i = 1; i <= n; i++) {
            prefixSum[i+1] = prefixSum[i] + i;
            total += i;
        }

        for (int i = 1; i <= n; i++) {
            int suffixSum = total - prefixSum[i] - i;
            if (prefixSum[i] == suffixSum) return i;
        }
        return -1;
    }
}