class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int m, l = 0, r = n - 1;
        while (l < r) {
            m = l + (r - l)/2;
            // we are asking where does the drop exist. we can confirm only by comparing mid to right
            if (nums[m] > nums[r]) { // rotation point is in this right half
                l = m + 1;
            }
            else { //candidate is in this left half
                r = m; 
            }
        }
        return nums[l];
    }
}