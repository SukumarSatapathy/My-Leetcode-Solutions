class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfWays(int n, int x) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int a = 1; ; a++) {
            long p = powLimit(a, x, n);
            if (p > n) break;
            int val = (int) p;
            for (int s = n; s >= val; s--) {
                dp[s] += dp[s - val];
                if (dp[s] >= MOD) dp[s] -= MOD;
            }
        }
        return dp[n];
    }

    private long powLimit(int a, int x, int limit) {
        long res = 1;
        for (int i = 0; i < x; i++) {
            res *= a;
            if (res > limit) return limit + 1;
        }
        return res;
    }
}
