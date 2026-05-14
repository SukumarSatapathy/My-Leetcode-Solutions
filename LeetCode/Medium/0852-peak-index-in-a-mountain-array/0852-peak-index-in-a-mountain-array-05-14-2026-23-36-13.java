class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0, r = n-1;
        while (l < r) {
            int m = l + (r - l + 1)/2; // right biased
            if (arr[m] > arr[m-1]) { // asc slope - peak in right half; invariant correct
                l = m;
            }
            else{ // desc slope - peak in left half
                r = m - 1; // m-1 right in righ biased
            }
        }
        return r;
    }
}