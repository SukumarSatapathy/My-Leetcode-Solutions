class Solution {
    public int searchInsert(int[] nums, int target) {
        // first idx where nums[i] >= target (B)
        int m, l = 0, r = nums.length;
        while (l < r) {
            m = l + (r - l)/2;
            if (nums[m] >= target) {
                r = m;
            }
            else {
                l = m + 1;
            }
        }
        return l;
    }
}