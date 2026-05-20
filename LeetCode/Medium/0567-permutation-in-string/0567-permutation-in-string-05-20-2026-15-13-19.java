class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // find a window of same length and freq count as as s1 
        // Freq array for freq and sliding window for length
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        int s1Len = s1.length(), s2Len = s2.length();
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        for (int i = 0; i < s2Len; i++) {
            char c = s2.charAt(i);
            s2Freq[c - 'a']++; // add new to window
            if (i >= s1Len - 1) { // once window length is achieved
                if (Arrays.equals(s1Freq, s2Freq)) return true; // check if possible
                s2Freq[s2.charAt(i-s1Len+1) - 'a']--; // remove old
            }
        }
        return false;
    }
}