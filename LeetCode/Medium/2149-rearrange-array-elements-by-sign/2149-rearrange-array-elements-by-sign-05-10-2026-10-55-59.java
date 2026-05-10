class Solution {
    public int[] rearrangeArray(int[] nums) {
        int evenIdx = 0, oddIdx = 1, n = nums.length;
        int[] res = new int[n];
        // will keep relative order of elements the same but O(n) space
        for (int num : nums) {
            if (num >= 0) {
                res[evenIdx] = num;
                evenIdx += 2;
            }
            else {
                res[oddIdx] = num;
                oddIdx += 2;
            }
        }
        return res;
    }
}