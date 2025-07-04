class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int pairs = 0;
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Integer count : freq.values()) {
            pairs += count * (count - 1) / 2; // n C 2 logic from maths
        }
        return pairs;
    }
}