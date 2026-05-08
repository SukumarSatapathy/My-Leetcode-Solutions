class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nr = n - 1, mr = m - 1, mnr = m + n - 1;
        while (nr >= 0 && mr >= 0) {
            if (nums1[mr] > nums2[nr]) {
                nums1[mnr] = nums1[mr];
                mr--;
            }
            else {
                nums1[mnr] = nums2[nr];
                nr--;
            }
            mnr--;
        }
        while(nr >= 0) { // adding back extra elements of nums2 if any
            nums1[mnr] = nums2[nr];
            nr--;
            mnr--;
        }
        // why not the same for nums1 ? Because they would be at the correct place anyway since we started from the end of the sorted array in nums1
    }
}