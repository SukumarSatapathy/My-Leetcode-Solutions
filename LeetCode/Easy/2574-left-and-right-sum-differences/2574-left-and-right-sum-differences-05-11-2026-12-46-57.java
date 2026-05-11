class Solution {
    public int[] leftRightDifference(int[] nums) {
        // instead of taking extra space, we can update the same array that stores prefix sum
        int n = nums.length, total = nums[0];
        int[] ans = new int[n];

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i-1] + nums[i-1];
            total += nums[i];
        }

        for (int i = 0; i < n; i++) {
            int rightSum = total - ans[i] - nums[i];
            ans[i] = Math.abs(ans[i] - rightSum);
        }
        return ans;
    }
}