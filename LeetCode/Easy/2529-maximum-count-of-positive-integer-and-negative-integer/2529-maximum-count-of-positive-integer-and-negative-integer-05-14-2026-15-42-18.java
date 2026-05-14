class Solution {
    public int maximumCount(int[] nums) {
        // Another way
        // find the 1st occur of 0 and 1
        // calculate count of +ve or -ve after that
        int positiveCount = nums.length - searchFirstOrInsert(nums, 1);
        return Math.max(searchFirstOrInsert(nums, 0), positiveCount);
    }

    public int searchFirstOrInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid, pos = nums.length; // O(log n) time
        // first i where arr[i] >= target
        while (l <= r) {
            mid = l + (r - l)/2;
            if (nums[mid] >= target) {
                pos = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return pos;
    }
}