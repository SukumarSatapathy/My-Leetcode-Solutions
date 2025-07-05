class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] counts = new int[101];
        int pairs = 0;
        for (int num : nums) {
            counts[num]++;
        }
        for (int freq : counts) {
            pairs += freq * (freq - 1) / 2;
        }
        return pairs;
    }
}