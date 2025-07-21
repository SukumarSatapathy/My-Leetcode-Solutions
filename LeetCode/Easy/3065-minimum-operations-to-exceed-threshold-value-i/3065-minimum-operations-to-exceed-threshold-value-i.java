class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int n : nums) {
            count += n < k ? 1 : 0;
        }
        return count;
    }
}