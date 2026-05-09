class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int w = 0; // read-write
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 == 0) {
                int t = nums[w];
                nums[w] = nums[r];
                nums[r] = t;
                w++;
            }
        }
        return nums;
    }
}