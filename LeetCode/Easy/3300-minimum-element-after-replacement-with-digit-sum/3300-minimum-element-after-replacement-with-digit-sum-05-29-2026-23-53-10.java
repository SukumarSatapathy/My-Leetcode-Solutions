class Solution {
    public int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;
        for (int n : nums) {
            mini = Math.min(mini, sumOfDigits(n));
        }
        return mini;
    }

    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}