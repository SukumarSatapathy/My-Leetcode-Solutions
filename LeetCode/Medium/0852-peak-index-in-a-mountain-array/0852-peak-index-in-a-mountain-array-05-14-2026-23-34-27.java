class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0, r = n-1;
        while (l < r) {
            int m = l + (r - l)/2; // left biased
            if (arr[m] < arr[m+1]) { // asc slope - peak in right half; invariant correct
                l = m + 1; // m+1 left in left biased
            }
            else{ // desc slope - peak in left half
                r = m;
            }
        }
        return r;
    }
}