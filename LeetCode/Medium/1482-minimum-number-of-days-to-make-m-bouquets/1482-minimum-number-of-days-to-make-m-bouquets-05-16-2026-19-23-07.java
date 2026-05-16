class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;
        // [min(bloomDay), max(bloomDay)]
        int lo = Integer.MAX_VALUE, hi = Integer.MIN_VALUE, ans = -1;
        for (int d : bloomDay) {
            lo = Math.min(lo, d);
            hi = Math.max(hi, d);
        }

        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public boolean canMake(int[] bloomDay, int m, int k, int days) {
        int adj = 0, bou = 0;
        for (int d : bloomDay) {
            if (d <= days) {
                adj++;
                if (adj == k) {
                    bou++;
                    adj = 0;
                }
            }
            else {
                adj = 0;
            }
        }
        return m <= bou;
    }
}