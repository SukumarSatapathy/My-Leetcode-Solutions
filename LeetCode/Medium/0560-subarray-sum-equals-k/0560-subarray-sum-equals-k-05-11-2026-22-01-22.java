class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>(); // prefixSum -> count
        freq.put(0, 1);
        int prefixSum = 0, totalCount = 0;
        for (int num : nums) {
            prefixSum += num;
            int currCount = freq.getOrDefault(prefixSum - k, 0); // count of starting indices for the curr index
            totalCount += currCount; // already existing count + curr count due to the existing idx as ending idx
            freq.put(prefixSum, freq.getOrDefault(prefixSum, 0) + 1); //update count of indices whose prefix sum = prefixSum
        }
        return totalCount;
    }
}