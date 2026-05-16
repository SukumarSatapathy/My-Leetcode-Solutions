class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = 1; // smallest div lies in [1, max(nums)]
        for (int n : nums) {
            r = Math.max(r, n);
        }

        while (l < r) {
            int m = l + (r - l)/2;
            if (canDivide(nums, m, threshold)) { // if yes, try smaller
                r = m;
            }
            else {
                l = m + 1;
            }
        }
        return l;
    }

    public boolean canDivide(int[] nums, int div, int threshold) {
        // is it possible to get a sum of quotients <= threshold with the current divisor div
        int sum = 0, usedDays = 1;
        for (int n : nums) {
            sum += (n + div - 1)/div; // int ceil. works for +ve nums
            if (sum > threshold) return false;
        }
        return true;
    }
}