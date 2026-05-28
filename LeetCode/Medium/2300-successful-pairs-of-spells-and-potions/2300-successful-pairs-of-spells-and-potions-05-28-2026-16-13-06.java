class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        Arrays.sort(potions);
        int[] pairs = new int[n];
        for (int i = 0; i < n; i++) {
            // int minPotion = (int) Math.ceil(1.0 * success/spells[i]);
            long minPotion = (success + spells[i] - 1) / spells[i];
            pairs[i] = countValidPotions(potions, minPotion);
        }
        return pairs;
    }

    public int countValidPotions(int[] potions, long key) {
        // find first or insert
        int lo = 0, len = potions.length;
        int hi = len;
        while (lo < hi) {
            int m = lo + (hi - lo) / 2;
            if (key <= potions[m]) {
                hi = m;
            }
            else {
                lo = m + 1;
            }
        }
        return len - lo;
    }
}