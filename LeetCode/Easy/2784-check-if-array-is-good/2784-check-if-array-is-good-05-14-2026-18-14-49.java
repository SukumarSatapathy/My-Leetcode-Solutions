class Solution {
    public boolean isGood(int[] nums) {
        int l = nums.length;
        int[] freq = new int[l]; // will store from 1 to n (l-1)
        for (int num : nums) {
            if (num < 1 || num > l-1) {
                return false;
            }
            freq[num]++;
        }

        for (int i = 1; i < l-1; i++) {
            if (freq[i] != 1) return false;
        }

        return freq[l-1] == 2;
    }
}