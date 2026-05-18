class Solution {
    public int maxVowels(String s, int k) {
        int windowCount = 0, n = s.length();
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) windowCount++;
        }
        int maxCount = windowCount;
        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) windowCount++;
            if (isVowel(s.charAt(i - k))) windowCount--;
            maxCount = Math.max(maxCount, windowCount);
            if (maxCount == k) return k; // early return
        }
        return maxCount;
    }

    public boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}