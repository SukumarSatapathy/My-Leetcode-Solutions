class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // can do with a set if constraints were larger
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}