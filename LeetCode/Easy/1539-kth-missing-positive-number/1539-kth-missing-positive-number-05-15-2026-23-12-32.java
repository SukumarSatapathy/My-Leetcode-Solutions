class Solution {
    public int findKthPositive(int[] arr, int k) {
        // bin search of ans
        int m, l = 0, r = arr.length; // [0, arr.length)
        while (l < r) {
            m = l + (r - l)/2;
            int miss = arr[m] - (m+1);
            if (miss < k) {
                l = m + 1;
            }
            else {
                r = m;
            }
        }
        return l + k; // l counted numbers (real) + k missing
    }
}