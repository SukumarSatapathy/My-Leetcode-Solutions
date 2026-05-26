class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // exactly k odd nums = atmost k - atmost k-1
        return subarraysWithAtMostK(nums, k) - subarraysWithAtMostK(nums, k-1);
    }

    public int subarraysWithAtMostK(int[] nums, int k) {
        int subarrays = 0, odds = 0, left = 0, n = nums.length;
        for (int right = 0; right < n; right++) {
            if (nums[right] % 2 == 1) odds++;
            while (odds > k) {
                if (nums[left] % 2 == 1) odds--;
                left++;
            }
            subarrays += right - left + 1;
        }
        return subarrays;
    }
}