class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int m = 0, l = 0, r = n - 1;
        while (l <= r) {
            m = l + (r - l)/2;
            if (nums[m] == target) return m;
            if (nums[l] <= nums[m]) { // left half sorted
                if (nums[l] <= target && target < nums[m]) { // inside left half
                    r = m - 1;
                }
                else { // inside right half
                    l = m + 1;
                }
            }
            else { // right half sorted
                if (nums[m] < target && target <= nums[r]) { // inside right half
                    l = m + 1;
                }
                else { // inside left half
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}