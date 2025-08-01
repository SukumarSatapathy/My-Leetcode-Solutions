class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int pairs = 0;

        for (int num : nums) {
            pairs += freq.getOrDefault(num, 0); // Each prior occurrence forms a good pair with the curr one
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return pairs;
    }
}