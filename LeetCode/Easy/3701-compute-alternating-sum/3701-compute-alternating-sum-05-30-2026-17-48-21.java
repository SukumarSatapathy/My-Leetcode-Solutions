class Solution {
    public int alternatingSum(int[] nums) {
        int sign = 1, sum = 0;
        for (int n : nums) {
            sum += sign == 1 ? n : -n;
            sign *= -1;
        }
        return sum;
    }
}