class Solution {
    public int maxNumberOfBalloons(String text) {
        if ("balloon".length() > text.length()) return 0;
        int[] freqInText = new int[26];
        int[] freqInBalloon = new int[26];
        // usual freq count using array for letters
        int minFreq = text.length();
        for (char c : text.toCharArray()) {
            freqInText[c - 'a']++;
        }
        for (char c : "balloon".toCharArray()) {
            freqInBalloon[c - 'a']++;
        }
        for (char c : "balloon".toCharArray()) {
            minFreq = Math.min(minFreq, freqInText[c - 'a']/freqInBalloon[c - 'a']);
        }
        return minFreq;
    }
}