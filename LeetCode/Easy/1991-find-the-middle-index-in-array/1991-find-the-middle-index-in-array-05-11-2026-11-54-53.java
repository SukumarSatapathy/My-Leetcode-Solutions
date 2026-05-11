class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length, total = 0;
        int[] prefix = new int[n+1]; // extra for better handling

        for (int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i] + nums[i];
            total += nums[i];
        }

        for (int i = 0; i < n; i++) {
            int suffix = total - prefix[i] - nums[i];
            if (prefix[i] == suffix) return i;
        }
        return -1;
    }
}