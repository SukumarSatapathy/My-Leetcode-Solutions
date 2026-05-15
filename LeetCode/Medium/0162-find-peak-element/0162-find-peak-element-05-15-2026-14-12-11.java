class Solution {
    public int findPeakElement(int[] nums) {
        int m, l = 0, r = nums.length - 1;
        while (l < r) {
            m = l + (r - l)/2;
            if (nums[m] < nums[m+1]) { // if m is smaller m definity is not peak. safely make l = m + 1
                l = m + 1;
            }
            else {
                r = m;
            }
        }
        return l;
    }
}