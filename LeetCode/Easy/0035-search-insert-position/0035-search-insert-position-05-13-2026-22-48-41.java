class Solution {
    public int searchInsert(int[] nums, int target) {
        // first idx where nums[i] >= target (A)
        int n = nums.length;
        int m, l = 0, r = n - 1, ans = n;
        while (l <= r) {
            m = l + (r - l)/2;
            if (nums[m] >= target) {
                ans = m;
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return ans;
    }
}