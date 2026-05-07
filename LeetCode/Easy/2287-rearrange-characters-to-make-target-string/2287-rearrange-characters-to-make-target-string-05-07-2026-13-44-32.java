class Solution {
    public int rearrangeCharacters(String s, String target) {
        if (target.length() > s.length()) return 0;
        int[] freqInS = new int[26];
        int[] freqInTarget = new int[26];
        // usual freq count using array for letters
        int minFreq = s.length();
        for (char c : s.toCharArray()) {
            freqInS[c - 'a']++;
        }
        for (char c : target.toCharArray()) {
            freqInTarget[c - 'a']++;
        }
        for (char c : target.toCharArray()) {
            minFreq = Math.min(minFreq, freqInS[c - 'a']/freqInTarget[c - 'a']);
        }
        return minFreq;
    }
}