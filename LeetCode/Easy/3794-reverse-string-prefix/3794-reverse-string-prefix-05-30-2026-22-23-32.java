class Solution {
    public String reversePrefix(String s, int k) {
        return new StringBuilder(s.substring(0, k)).reverse().append(s.substring(k)).toString();
    }
}