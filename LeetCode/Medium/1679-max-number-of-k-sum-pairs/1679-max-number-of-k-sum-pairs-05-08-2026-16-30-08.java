class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        // 1,3,3,3,4
        // 1,2,3,4
        int l = 0, r = nums.length - 1, count = 0;
        while (l < r) {
            if (nums[l] + nums[r] == k) {
                l++; r--; count++;
            }
            else if (nums[l] + nums[r] < k) {
                l++;
            }
            else {
                r--;
            }
        }
        return count;
    }
}