class Solution {
    public int firstMatchingIndex(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) { // ques considers same index to be valid as well
            if (s.charAt(l) == s.charAt(r)) return l;
            l++; r--;
        }
        return -1;
    }
}