class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        // usual bin search
        int l = 1, r = num/2;
        while (l <= r) {
            int m = l + (r-l)/2;
            long sq = 1L * m * m; // or else we will get TLE due to integer overflow
            if (sq == num) return true;
            else if (sq < num) l = m + 1;
            else r = m - 1;
        }
        return false;
    }
}