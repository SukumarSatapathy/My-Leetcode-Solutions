class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map <Integer, Integer> freq = new HashMap<>(); // prefixSum -> freq
        freq.put(0, 1); // Same patter as subarrays with sum = k
        int prefixSum = 0, count = 0;

        for (int num : nums) {
            prefixSum += num;
            count += freq.getOrDefault(prefixSum - goal, 0);
            freq.put(prefixSum, freq.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}