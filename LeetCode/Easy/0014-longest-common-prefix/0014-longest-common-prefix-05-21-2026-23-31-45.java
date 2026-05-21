class Solution {
    public String longestCommonPrefix(String[] strs) {
        // time O(n * m) n -> length of array and m -> length of longest word
        String prefix, base = strs[0], longest = strs[0];
        int len = strs.length, baseLen = base.length();
        for (String s : strs) {
            int min = Math.min(baseLen, s.length());
            int i = 0;
            for (i = 0; i < min; i++) {
                if (s.charAt(i) != base.charAt(i))
                    break;
            }
            prefix = s.substring(0, i);
            longest = (prefix.length() < longest.length()) ? prefix : longest;
        }
        return longest;
    }
}