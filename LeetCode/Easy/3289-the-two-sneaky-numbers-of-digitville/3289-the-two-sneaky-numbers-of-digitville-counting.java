class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length + 1];
        int[] result = new int[2];
        int idx = 0;
        for (int num : nums) {
            freq[num]++;
            if (freq[num] == 2) {
                result[idx++] = num;
            }
        }
        return result;
    }
}