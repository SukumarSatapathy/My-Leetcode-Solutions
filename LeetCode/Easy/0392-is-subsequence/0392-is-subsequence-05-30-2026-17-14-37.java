class Solution {
    public boolean isSubsequence(String s, String t) {
        int reader = 0, validator = 0, sLen = s.length(), tLen = t.length();
        if (sLen == 0) return true;
        while (reader < tLen && validator < sLen) {
            if (t.charAt(reader) == s.charAt(validator)) {
                validator++;
            }
            reader++;
        }
        return validator == sLen;
    }
}