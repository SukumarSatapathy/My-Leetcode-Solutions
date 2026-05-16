class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l = 0, r = 0; // search in [0, max(candies)]
        for (int c : candies) {
            r = Math.max(r, c);
        }

        while (l < r) {
            int m = l + (r - l + 1)/2;
            if (canDivide(candies, m, k)) {
                l = m;
            }
            else {
                r = m - 1;
            }
        }
        return l;
    }

    public boolean canDivide(int[] candies, int c, long k) {
        // to find out if it is possible to give c candies to each of the k kids
        long count = 0;
        for (int pile : candies) {
            count += pile/c;
            if (count >= k) return true;
        }
        return false;
    }
}