class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum = 0, dSum = 0;
        for (int num : nums) {
            eSum += num;
            dSum += sumOfDigits(num);
        }
        return Math.abs(eSum - dSum);
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}