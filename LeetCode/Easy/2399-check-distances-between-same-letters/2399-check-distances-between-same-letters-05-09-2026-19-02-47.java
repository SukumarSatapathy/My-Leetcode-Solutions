class Solution {
    public boolean checkDistances(String s, int[] distance) {
        // count array
        int[] firstIdx = new int[26];
        char firstChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (firstIdx[c - 'a'] != 0 || c == firstChar) {
                if (i - firstIdx[c - 'a'] - 1 != distance[c - 'a']) return false;
            }
            else {
                firstIdx[c - 'a'] = i;
            }
        }
        return true;
    }
}