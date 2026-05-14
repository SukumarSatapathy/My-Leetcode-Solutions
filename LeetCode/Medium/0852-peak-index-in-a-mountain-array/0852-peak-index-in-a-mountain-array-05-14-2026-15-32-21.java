class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0, r = n-1;
        while (l <= r) {
            int m = l + (r - l)/2;
            if ((m == 0 || arr[m] > arr[m-1]) && (m == n-1 || arr[m] > arr[m+1])) {
                return m;
            }
            else if (m == 0 || arr[m] > arr[m-1]) { // asc slope - peak in right half
                l = m + 1;
            }
            else if (m == n-1 || arr[m] > arr[m+1]) { // desc slope - peak in left half
                r = m - 1;
            }
        }
        return -1;
    }
}