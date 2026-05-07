class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        // Two pointers. Reverse thrice. O(1) extra space
        k = k % l;
        reverse(nums, 0, l - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, l - 1);
        
    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}