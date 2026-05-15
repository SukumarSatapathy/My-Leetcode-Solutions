class Solution {
    public int arrangeCoins(int n) {
        // for k rows we will need k*(k+1) coins at least. find max k where k*(k+1) < n
        // lowerbound style
        int m, l = 1, r = n;
        while (l < r) {
            m = l + (r - l + 1)/2; // right biased
            long need = 1L * m * (m+1)/2;
            if (need <= n) {
                l = m;
            }
            else {
                r = m - 1;
            }
        }
        return l;
    }
}