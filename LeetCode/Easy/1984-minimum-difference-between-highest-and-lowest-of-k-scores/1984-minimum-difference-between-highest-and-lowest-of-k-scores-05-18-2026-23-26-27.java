class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDiff = nums[k-1] - nums[0];
        for (int i = k; i < n; i++) {
            minDiff = Math.min(minDiff, nums[i] - nums[i-k+1]);
        } 
        return minDiff;
    }
}