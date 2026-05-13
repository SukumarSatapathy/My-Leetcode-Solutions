class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // temp A (record ans)
        int l = 0, r = letters.length - 1;
        int ans = letters.length;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (letters[mid] > target) {
                ans = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return letters[ans % letters.length]; // common template but needs ans = letters.length;
    }
}