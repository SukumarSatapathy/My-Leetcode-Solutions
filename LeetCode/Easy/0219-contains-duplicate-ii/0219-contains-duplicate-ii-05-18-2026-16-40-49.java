class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Sliding window
        // O(n) time, O(n) space
        int n = nums.length, windowCount = 0;

        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < n; i++) {
            // Remove element that's now outside the window
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            
            // If element already in window, found duplicate
            if (!window.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}