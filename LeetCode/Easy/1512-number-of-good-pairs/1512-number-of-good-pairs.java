class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] counts = new int[101];
        int totalPairs = 0;
        for (int num : nums) {
            int pairsAdded = counts[num]; // each prior occurance forms a good pair with the curr one
            totalPairs += pairsAdded;
            counts[num]++;
        }
        return totalPairs;
    }
}