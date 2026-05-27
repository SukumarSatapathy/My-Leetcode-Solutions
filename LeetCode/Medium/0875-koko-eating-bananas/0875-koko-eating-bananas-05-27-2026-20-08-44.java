class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // [1, max(piles)]
        int lo = 1, hi = Integer.MIN_VALUE;
        for (int p : piles) {
            hi = Math.max(hi, p);
        }
        while (lo < hi) {
            int m = lo + (hi - lo)/2; // left aligned
            if (canFinishPiles(piles, m, h)) {
                hi = m;
            }
            else {
                lo = m + 1;
            }
        }
        return lo;
    }

    public boolean canFinishPiles(int[] piles, int speed, int maxHours) {
        long hoursTaken = 0;
        for (int p : piles) {
            hoursTaken += (p + speed - 1L) / speed;
        }
        return hoursTaken <= maxHours;
    }
}