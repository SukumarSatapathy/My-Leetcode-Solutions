class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxCon = 0, maxVow = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                maxVow = Math.max(maxVow, freq[i]);
            }
            else {
                maxCon = Math.max(maxCon, freq[i]);
            }
        }
        return maxCon + maxVow;
    }
}