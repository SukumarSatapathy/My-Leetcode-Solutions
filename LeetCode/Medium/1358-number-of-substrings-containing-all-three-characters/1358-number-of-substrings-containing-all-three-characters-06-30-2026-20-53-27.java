class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0, count = 0, len = s.length();
        int[] freq = new int[3]; // can use a set or hashmap but for 3 integers array is much faster
        // n - right pattern. find first valid left then all remaining ones would be valid
        for (int right = 0; right < len; right++) {
            char c = s.charAt(right); // expand
            freq[c - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) { // valid check
                count += len - right; // update ans
                freq[s.charAt(left) - 'a']--;
                left++; // shrink left end
                // consider a case like aaaaaaaaabc
            }
        }
        return count;
    }
}