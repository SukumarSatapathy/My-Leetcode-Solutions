class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length, total = 0;
        int[] prefix = new int[n];
        prefix[0] = 0;
        total = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i-1];
            total += nums[i];
        }

        for (int i = 0; i < n; i++) {
            int suffix = total - prefix[i] - nums[i];
            if (prefix[i] == suffix) return i;
        }
        return -1;
    }
}