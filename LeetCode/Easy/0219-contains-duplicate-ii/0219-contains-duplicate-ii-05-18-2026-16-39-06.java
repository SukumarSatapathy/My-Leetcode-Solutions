class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Sliding window
        // O(n) time, O(n) space
        int n = nums.length, windowCount = 0;

        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (windowCount < k) { // build first window
                if (!seen.add(nums[i])) return true;
                windowCount++;
            }
            else { // slide
                if (!seen.add(nums[i])) return true;
                seen.remove(nums[i - k]);
            }
        }
        return false;
    }
}