class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int pairs = 0;
        for (int num : nums) {
            int count = freq.getOrDefault(num, 0);
            pairs += count;
            freq.put(num, ++count);
        }
        return pairs;
    }
}