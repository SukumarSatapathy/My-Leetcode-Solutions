class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int prev2 = 1, prev1 = 1, curr = prev1 + prev2;
        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}