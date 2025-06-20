class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                tIndex++;
            }
            else {
                tIndex++;
            }
        }
        return sIndex == s.length() ? true : false;
    }
}