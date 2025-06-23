class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] == 0 && nums[fast] != 0) {
                nums[slow] += nums[fast];
                nums[fast] = nums[slow] - nums[fast];
                nums[slow] -= nums[fast];
                slow++;
            }
            else if (nums[slow] != 0) {
                slow++;
            }
        }
    }
}