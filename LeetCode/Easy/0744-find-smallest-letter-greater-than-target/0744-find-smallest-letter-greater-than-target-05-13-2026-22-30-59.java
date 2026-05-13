class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // temp B (lower bound)
        int l = 0, r = letters.length - 1;
        while (l < r) {
            int mid = l + (r - l)/2;
            if (letters[mid] > target) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }
        return letters[l] > target ? letters[l] : letters[0];
    }
}