class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsOnes = 0, consOnes = 0, left = 0, n = nums.length;
        // just count streaks. No sliding window needed
        for (int right = 0; right < n; right++) {
            if (nums[right] == 1) {
                consOnes++;
                maxConsOnes = Math.max(maxConsOnes, consOnes);
            }
            else {
                consOnes = 0;
            }
        }
        return maxConsOnes;
    }
}