class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Solution 3 - most optimized
        // two loops, 1 array to store count
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}