class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, n = nums.length, del = 0, maxLen = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                del++;
            }
            while (del > 1) {
                if (nums[left] == 0) {
                    del--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left); // because we have to count one less the range contains one deletion
        }
        return maxLen == n ? maxLen - 1 : maxLen;
    }
}