class Solution {
    public int arrangeCoins(int n) {
        // for k rows we will need k*(k+1) coins at least. find max k where k*(k+1) < n
        int m, ans = 1, l = 0, r = n;
        while (l <= r) {
            m = l + (r - l)/2;
            long need = 1L * m * (m+1)/2;
            if (need <= n) {
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