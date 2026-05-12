class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {searchFirst(nums, target), searchLast(nums, target)};
    }

    public int searchFirst(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid, pos = -1; // O(log n) time
        while (l <= r) {
            mid = l + (r - l)/2;
            if (target == nums[mid]) {
                pos = mid;
                r = mid - 1;
            }
            else if (target < nums[mid]) r = mid - 1;
            else l = mid + 1;
        }
        return pos;
    }

    public int searchLast(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid, pos = -1; // O(log n) time
        while (l <= r) {
            mid = l + (r - l)/2;
            if (target == nums[mid]) {
                pos = mid;
                l = mid + 1;
            }
            else if (target < nums[mid]) r = mid - 1;
            else l = mid + 1;
        }
        return pos;
    }
}