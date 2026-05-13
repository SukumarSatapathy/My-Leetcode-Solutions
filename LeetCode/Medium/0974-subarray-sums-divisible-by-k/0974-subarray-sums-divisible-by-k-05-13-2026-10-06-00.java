class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>(); // prefix % k -> freq
        // similar to subarray sum = k
        freq.put(0, 1);
        int pSum = 0, count = 0, rem, f;
        for (int n : nums) {
            pSum += n;
            rem = pSum % k; // for divisible by k
            if (rem < 0) rem += k;
            f = freq.getOrDefault(rem, 0); // starting points of subarrays
            count += f; // add to existing counts
            freq.put(rem, ++f); // update for next potential end index
        }
        return count;
    }
}