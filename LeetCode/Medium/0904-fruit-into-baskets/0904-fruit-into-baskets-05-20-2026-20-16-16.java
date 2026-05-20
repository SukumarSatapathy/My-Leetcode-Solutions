class Solution {
    public int totalFruit(int[] fruits) {
        int count = 0, n = fruits.length, left = 0;
        int maxLen = 0;
        int[] freq = new int[n];
        for (int right = 0; right < n; right++) {
            if (freq[fruits[right]] == 0) { // expand
                count++;
            }
            freq[fruits[right]]++;
            while(count > 2) { // invalid check
                freq[fruits[left]]--;
                if (freq[fruits[left]] == 0) {
                    count--;
                }
                left++;// shrink
            }
            maxLen = Math.max(maxLen, right - left + 1); // update result
        }
        return maxLen;
    }
}