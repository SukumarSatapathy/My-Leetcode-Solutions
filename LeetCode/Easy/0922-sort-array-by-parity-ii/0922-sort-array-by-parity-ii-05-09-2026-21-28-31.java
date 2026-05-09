class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIdx = 0, oddIdx = 1;
        while (evenIdx < nums.length & oddIdx < nums.length) {
            // find a wrong fit in even idx
            while (evenIdx < nums.length && nums[evenIdx] % 2 == 0) {
                evenIdx += 2;
            }

            // find a wrong fit in odd idx
            while (oddIdx < nums.length && nums[oddIdx] % 2 != 0) {
                oddIdx += 2;
            }

            // swap for a wrong combination to correct it
            if (oddIdx < nums.length && evenIdx < nums.length) {
                int temp = nums[evenIdx];
                nums[evenIdx] = nums[oddIdx];
                nums[oddIdx] = temp;
            }
        }
        return nums;
    }
}