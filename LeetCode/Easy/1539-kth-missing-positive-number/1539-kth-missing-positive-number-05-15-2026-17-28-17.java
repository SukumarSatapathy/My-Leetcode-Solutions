class Solution {
    public int findKthPositive(int[] arr, int k) {
        // brute force - same dir pointers
        // curr - current natural number
        // i - index tracker
        int i = 0, curr = 1;
        while (k > 0) {
            if (i < arr.length && arr[i] == curr) {
                i++;
            } else {
                k--;
            }
            if (k == 0) return curr;
            curr++;
        }
        return curr;
    }
}