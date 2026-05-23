class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        // variable slide with longest
        int left = 0, cost = 0, len = s.length(), maxLen = 0;
        for (int right = 0; right < len; right++) {
            cost += Math.abs(s.charAt(right) - t.charAt(right)); // expand
            while (cost > maxCost) { // invalid case
                cost -= Math.abs(s.charAt(left) - t.charAt(left)); // shrink
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1); // update ans
        }
        return maxLen;
    }
}