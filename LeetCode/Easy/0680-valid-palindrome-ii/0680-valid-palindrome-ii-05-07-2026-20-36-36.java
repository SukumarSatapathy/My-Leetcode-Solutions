class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        // Greedy sol won't work here. Need to check both paths entirely
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalin(s, l+1, r) || isPalin(s, l, r-1);
            }
            
            l++;
            r--;
        }
        return true;
    }

    public boolean isPalin(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            
            l++;
            r--;
        }
        return true;
    }
}