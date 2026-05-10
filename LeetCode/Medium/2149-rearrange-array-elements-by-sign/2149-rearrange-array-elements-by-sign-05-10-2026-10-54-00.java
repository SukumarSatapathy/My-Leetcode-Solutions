class Solution {
    public int[] rearrangeArray(int[] nums) {
        int evenIdx = 0, oddIdx = 1, i = 0, n = nums.length;
        int[] res = new int[n];
        // will keep relative order of elements the same but O(n) space
        while (evenIdx < n || oddIdx < n) {
            if (evenIdx < n && nums[i] >= 0) {
                res[evenIdx] = nums[i];
                evenIdx += 2;
            }
            else if (oddIdx < n && nums[i] < 0) {
                res[oddIdx] = nums[i];
                oddIdx += 2;
            }
            i++;
        }
        return res;
    }
}