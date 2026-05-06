class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Solution 3 - most optimized
        // two loops, 1 array to store count
        if (ransomNote.length() > magazine.length()) return false;

        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false;
            }
            freq[c - 'a']--;
        }
        return true;
    }
}