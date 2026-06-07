class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // dp[i] means min cost to reach at the top of floor i or to cross floor i
        // we won't include the stair i in dp[i] since dp[i] doesn't mean stand at pos i but cross it
        // dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        int curr = 0, prev2 = 0, prev1 = 0, n = cost.length;
        for (int i = 2; i <= n; i++) {
            curr = Math.min(prev1 + cost[i-1], prev2 + cost[i - 2]);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}