class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0, n = nums.length;
        // first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k]; // add new, remove old
            maxSum = Math.max(maxSum, windowSum);
        }
        return 1.0 * maxSum/k;
    }
}