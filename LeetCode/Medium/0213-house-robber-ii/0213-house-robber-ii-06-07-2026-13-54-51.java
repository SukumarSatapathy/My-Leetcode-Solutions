class Solution {
    public int rob(int[] nums) {
        // check the max of robbing the first house vs skipping it
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(robRange(nums, 0, n - 2), robRange(nums, 1, n - 1));
    }

    private int robRange(int[] amounts, int start, int end) { // both start and end are inclusive
        int curr = 0, prev2 = 0, prev1 = 0;
        for (int i = start; i <= end; i++) {
            curr = Math.max(prev1, prev2 + amounts[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}