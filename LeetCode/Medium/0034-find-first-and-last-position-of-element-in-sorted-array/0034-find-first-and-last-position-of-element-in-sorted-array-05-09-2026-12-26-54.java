class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1; // O(n) time. Will fail the time constrain
        while (l <= r) {
            if (nums[l] == nums[r] && nums[l] == target) {
                return new int[] {l, r};
            }
            if (nums[l] != target) l++;
            if (nums[r] != target) r--;
        }
        return new int[] {-1, -1};
    }
}