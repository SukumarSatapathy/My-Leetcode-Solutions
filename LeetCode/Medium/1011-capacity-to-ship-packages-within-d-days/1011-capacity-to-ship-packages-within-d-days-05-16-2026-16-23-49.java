class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0; // search in [max(weights), sum(weights)]
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }

        while (l < r) {
            int m = l + (r - l)/2;
            if (canShip(weights, m, days)) { // if yes, try smaller
                r = m;
            }
            else {
                l = m + 1;
            }
        }
        return l;
    }

    public boolean canShip(int[] weights, int cap, int days) {
        // is it possible to ship all weights with a ship of capacity cap within days days
        int curr = 0, usedDays = 1;
        for (int w : weights) {
            if (curr + w > cap) {
                usedDays++;
                curr = 0;
            }
            curr += w;
            if (usedDays > days) return false;
        }
        return true;
    }
}