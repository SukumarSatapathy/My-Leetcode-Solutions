class Solution {
    public int largestAltitude(int[] gain) {
        // read the eg carefully, it's prefix sum
        // O(n) time and O(1) space 
        int currAlt = 0, maxAlt = 0;
        for (int g : gain) {
            currAlt += g;
            maxAlt = Math.max(maxAlt, currAlt);
        }
        return maxAlt;
    }
}