class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int n : nums) {
            count += n % 3 == 0 ? 0 : 1;
        }
        return count;
    }
}