class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int currPos = 0, count = 0; // usual prefix sum. O(n) time, O(1) space
        for (int n : nums) {
            currPos += n;
            count += currPos == 0 ? 1 : 0;
        }
        return count;
    }
}