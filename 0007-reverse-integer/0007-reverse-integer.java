class Solution {
    public int reverse(int x) {
        int sign = x * -1 > 0 ? -1 : 1;
        int x1 = 0;
        int prev = 0;
        x = Math.abs(x);

        while (x > 0) {
            int rem = x % 10;
            x1 = 10 * x1 + rem;
            if ((x1 - x % 10) / 10 != prev) return 0;
            prev = x1;
            x /= 10;
        }      

        return x1 * sign;
    }
}