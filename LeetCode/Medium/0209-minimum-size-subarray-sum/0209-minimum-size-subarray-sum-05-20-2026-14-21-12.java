class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = n+1, sum = 0, left = 0; // may take Integer.MAX_VALUE also
        for (int right = 0; right < n; right++) {
            sum += nums[right]; // expand
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1); // update ans
                sum -= nums[left];
                left++; // shrink window
            }
        }
        return minLen == n+1 ? 0 : minLen;
    }
}