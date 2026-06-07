class Solution {
    public int rob(int[] nums) {
        // dp[i] means it is better to rob house i or better off skipping it
        // dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        int curr = 0, prev2 = 0, prev1 = 0;
        for (int num : nums) {
            curr = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}