class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            if (freq[c - 'a'] >= 2) return c;
        }
        return 'x'; // dead fallback. ques guarentees there will be a repeating letter
    }
}