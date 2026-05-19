class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, count = 0, maxLen = 0, n = nums.length;
        for(int right = 0; right < n; right++) {
            if (nums[right] == 0) count ++; // expand window
            while (count > k) { // invalid check
                if (nums[left] == 0) count--; // shrink
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1); // update result
        }
        return maxLen;
    }
}