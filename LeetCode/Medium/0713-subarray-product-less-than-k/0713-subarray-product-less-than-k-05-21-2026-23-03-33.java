class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1, len = nums.length, left = 0, count = 0;
        if (k <= 1) return 0;
        for (int right = 0; right < len; right++) {
            prod *= nums[right]; // expand
            while (prod >= k) { // invalid check
                prod /= nums[left]; // shrink
                left++;
            }
            count += right - left + 1; // add window size
            // how many valid starting points exist for the current right (starts from smallest valid left)
        }
        return count;
    }
}