class Solution {
    public int characterReplacement(String s, int k) {
        int sLen = s.length(), left = 0, maxFreq = 0, maxLen = 0;
        int[] freq = new int[26];
        for (int right = 0; right < sLen; right++) {
            char c = s.charAt(right);
            freq[c - 'A']++; // expand
            maxFreq = Math.max(maxFreq, freq[c - 'A']);
            int winLen = right - left + 1;
            while (winLen - maxFreq > k) { // invalid case
                freq[s.charAt(left) - 'A']--;
                left++;
                winLen = right - left + 1;
            }
            maxLen = Math.max(maxLen, winLen); // update ans
        }
        return maxLen;
    }
}