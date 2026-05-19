class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, longest = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right); 
            while (seen.contains(ch)) { // invalid check
                seen.remove(s.charAt(left)); // shrink
                left++;
            }
            seen.add(ch); // expand
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}