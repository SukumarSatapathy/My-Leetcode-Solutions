class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        // find first i where i*i <= x
        // pat A
        int l = 1, r = x / 2, ans = 0;
        while (l <= r) {
            int m = l + (r - l)/2;
            long sq = 1L * m * m;
            if (sq <= x) {
                ans = m;
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return ans;
    }
}