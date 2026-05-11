class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) return false;

        Map<Integer, Integer> freq = new HashMap<>(); // prefixSum % k -> firstIdx when it appeared
        // [4, 1, 2, 3] and 6
        // if we get the prefix sum, it looks like this [4, 5, 7, 10]
        // if we make it prefix sum % k, it looks like this [4, 5, 1, 4]
        // note, any two indices having equal remainders would be a multiple of k
        // edge case to note : sub array length at least 2, hence map stores 1st idx
        int rem, prefixSum = 0;
        freq.put(0, -1); // before starting the array the prefix sum = 0
        
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            rem = prefixSum % k;
            if (!freq.containsKey(rem)) {
                freq.put(rem, i);
            }
            else if (i - freq.get(rem) >= 2) // cuz subarray starts from the next 1st idx + 1
                return true;
        }
        return false;
    }
}