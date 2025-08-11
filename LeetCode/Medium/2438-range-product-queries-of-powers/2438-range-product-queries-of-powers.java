class Solution {
    public int[] productQueries(int n, int[][] queries) {
        final int MOD = 1_000_000_007;

        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i < 31; ++i) {
            if ((n & (1 << i)) != 0) {
                powers.add(1 << i);
            }
        }

        int[] prefix = new int[powers.size()];
        prefix[0] = powers.get(0);
        for (int i = 1; i < powers.size(); ++i) {
            prefix[i] = (int)((1L * prefix[i - 1] * powers.get(i)) % MOD);
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int left = queries[i][0];
            int right = queries[i][1];

            if (left == 0) {
                result[i] = prefix[right];
            } else {
                result[i] = (int)((1L * prefix[right] * modInverse(prefix[left - 1], MOD)) % MOD);
            }
        }

        return result;
    }

    private int modInverse(int a, int mod) {
        return power(a, mod - 2, mod);
    }

    private int power(int base, int exp, int mod) {
        long result = 1;
        long b = base;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * b) % mod;
            b = (b * b) % mod;
            exp >>= 1;
        }
        return (int)result;
    }
}
